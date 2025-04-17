# Docker Commands for MongoDB and Mongo-Express Setup

This document provides a step-by-step guide to run MongoDB and Mongo-Express containers using Docker.

## 1. Test Docker Installation
```bash
docker run hello-world

```

This command runs a test to check if Docker is installed and working correctly. It fetches the `hello-world` image from Docker Hub and runs a simple container, displaying a confirmation message.

## 2. List Docker Networks

```bash
docker network ls

```

This command lists all Docker networks available on the system. It provides information about existing networks, including the default network settings.

## 3. Create a Custom Docker Network

```bash
docker network create mongo-network

```

This command creates a custom Docker network named `mongo-network`. This is useful for connecting multiple containers (e.g., MongoDB and Mongo-Express) to communicate with each other securely.

## 4. List Docker Networks Again

```bash
docker network ls

```

This command lists the available Docker networks again to verify that the `mongo-network` was successfully created.

## 5. Run MongoDB Container

```bash
docker run -d -p 27017:27017 --name mongo --network mongo-network -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=admin mongo

```

This command runs a MongoDB container in detached mode (`-d`). It maps port `27017` of the container to the host system's `27017`, names the container `mongo`, and attaches it to the `mongo-network`. It also sets up MongoDB with a root username `admin` and password `admin`.

## 6. Inspect Docker Network

```bash
docker network inspect mongo-network

```

This command provides detailed information about the `mongo-network`, including the connected containers and network settings. It's useful for verifying the correct network configuration.

## 7. Run Mongo-Express Container

```bash
docker run -d -p 8081:8081 --name mongo-express --network mongo-network -e ME_CONFIG_MONGODB_ADMINUSERNAME=admin -e ME_CONFIG_MONGODB_ADMINPASSWORD=admin -e ME_CONFIG_MONGODB_URL="mongodb://admin:admin@mongo:27017" mongo-express

```

This command runs the Mongo-Express container in detached mode (`-d`). It maps port `8081` of the container to the host system's `8081`, names the container `mongo-express`, and attaches it to the `mongo-network`. It also sets the MongoDB admin username and password for Mongo-Express to connect to the MongoDB container running in the `mongo-network`.
