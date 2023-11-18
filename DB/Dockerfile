# Use the official PostgreSQL image as the base image
FROM postgres:latest

# Set environment variables
ENV POSTGRES_DB CodeMelodies
ENV POSTGRES_USER wiola
ENV POSTGRES_PASSWORD ztpai

# Copy SQL scripts to the /docker-entrypoint-initdb.d/ directory in the container
COPY db-init.sql /docker-entrypoint-initdb.d/10-db-init.sql
COPY insert-dummies.sql /docker-entrypoint-initdb.d/30-insert-dummies.sql