# Use the official PostgreSQL image as the base image
FROM postgres:latest

# Update package lists and install xxd and dos2unix
RUN apt-get update && \
    apt-get install -y vim-common && \
    apt-get install -y dos2unix && \
    rm -rf /var/lib/apt/lists/*

# Set environment variables
ENV POSTGRES_DB CodeMelodies
ENV POSTGRES_USER wiola
ENV POSTGRES_PASSWORD ztpai

# Copy SQL scripts to the /docker-entrypoint-initdb.d/ directory in the container
COPY db-init.sql /docker-entrypoint-initdb.d/10-db-init.sql
COPY insert-dummies.sql /docker-entrypoint-initdb.d/30-insert-dummies.sql
COPY generate-image-insert-sql.sh /tmp/generate-image-insert-sql.sh

# Convert line endings to Unix format
RUN dos2unix /tmp/generate-image-insert-sql.sh

# Copy dummy images to tmp directory
COPY ./dummy-images/ /tmp/images/

RUN chmod +x /tmp/generate-image-insert-sql.sh && \
    /tmp/generate-image-insert-sql.sh