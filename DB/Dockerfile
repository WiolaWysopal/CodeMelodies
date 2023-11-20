# Use the official PostgreSQL image as the base image
FROM postgres:latest

# Update package lists and install xxd
RUN apt-get update && \
    apt-get install -y vim-common && \
    rm -rf /var/lib/apt/lists/*

# Set environment variables
ENV POSTGRES_DB CodeMelodies
ENV POSTGRES_USER wiola
ENV POSTGRES_PASSWORD ztpai

# Copy SQL scripts to the /docker-entrypoint-initdb.d/ directory in the container
COPY db-init.sql /docker-entrypoint-initdb.d/10-db-init.sql
COPY insert-dummies.sql /docker-entrypoint-initdb.d/30-insert-dummies.sql

# Copy dummy images to tmp directory
COPY ./dummy-images/ /tmp/images/
COPY encode_images.sh /tmp/images/encode_images.sh

# Set work directory to images directory
WORKDIR /tmp/images

# Give execute permissions and run the script to encode images
RUN chmod +x encode_images.sh && \
    ./encode_images.sh