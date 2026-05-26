#!/usr/bin/env bash

# Copyright 2026 eBay Inc.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

set -euo pipefail

# Usage: add-license-headers.sh [directory]
# Adds Apache 2.0 license headers to all Java and Kotlin files under the given directory.
# Skips files that already have the header and build/ directories.
# Safe to run multiple times (idempotent).

TARGET="${1:-.}"

HEADER='// Copyright 2026 eBay Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.'

count=0

while IFS= read -r -d '' file; do
    result=$(python3 -c "
import sys
file_path = sys.argv[1]
header = sys.argv[2]

with open(file_path, 'r', encoding='utf-8') as f:
    content = f.read()

if 'Copyright 2026 eBay' in content:
    print('skip')
    sys.exit(0)

new_content = header + '\n\n' + content

with open(file_path, 'w', encoding='utf-8') as f:
    f.write(new_content)

print('added')
" "$file" "$HEADER")
    if [ "$result" = "added" ]; then
        echo "Added: $file"
        count=$((count + 1))
    fi
done < <(find "$TARGET" -type f \( -name "*.java" -o -name "*.kt" \) ! -path "*/build/*" ! -path "*/.gradle/*" -print0)

echo "Done. Added license headers to $count file(s)."
