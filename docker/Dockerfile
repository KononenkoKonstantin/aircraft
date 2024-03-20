# Use the official MongoDB image as the base image
FROM mongo:5

# Set environment variables for creating a user with admin role
ENV MONGO_INITDB_ROOT_USERNAME admin
ENV MONGO_INITDB_ROOT_PASSWORD adminPassword
ENV MONGO_INITDB_DATABASE aircraftDb

# Create a directory for initialization scripts
 COPY ./mongo-init/ /docker-entrypoint-initdb.d/

# The initialization script will create the user with admin role
