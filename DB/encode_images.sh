#!/bin/bash

# Directory containing PNG files
PNG_DIR="/tmp/images"

# Change to the PNG directory
cd "$PNG_DIR"

# Loop over all PNG files in the current directory
for file in *.png; do
    # Skip if no PNG files are found
    [ -e "$file" ] || continue

    # Base filename without path and extension
    base_name=$(basename "$file" .png)

    # Encode to base64 and save to a .b64 file
    base64 "$file" > "$base_name.b64"

    # Delete the original PNG file
    rm "$file"
done
