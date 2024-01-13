#!/bin/bash

# Directory containing image files
IMAGE_DIR="/tmp/images"

# Output SQL script file
SQL_SCRIPT="/docker-entrypoint-initdb.d/20-insert_images.sql"

# Create or clear the output SQL script file
echo "-- Insert images into the database" > "$SQL_SCRIPT"

# Process each image file and append to the SQL script
for file in "$IMAGE_DIR"/*.png; do
    # Skip if no image files are found
    [ -e "$file" ] || continue

    # Extract the ID from the filename (filename is the ID)
    FILENAME=$(basename "$file")
    ID="${FILENAME%.*}"

    # Read the binary data and format it as a hex string
    BINARY_DATA=$(xxd -p -c 1000000 "$file" | tr -d '\n')

    # Append the INSERT statement to the SQL script
    echo "INSERT INTO Images (image_id, image) VALUES ('$ID',decode('$BINARY_DATA', 'hex'));" >> "$SQL_SCRIPT"
done

# Remove the script itself
rm -- "$0"