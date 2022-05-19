# Getting Started

# Before all

## Required

Tools install

- jdk
- gradle

Running the build project for bin file.

```bash
./gradlew clean build
```

# Running image docker

```bash
docker build --build-arg JAR_FILE=./build/libs/demo-0.0.1-SNAPSHOT.jar -t speedrun/hello_rest .
```

1. Check the image created with success.

```bash
docker ps

REPOSITORY            TAG            IMAGE ID       CREATED          SIZE
speedrun/hello_rest   latest         3ae6b2708661   49 seconds ago   132MB

```

2. Execute image created in mode interactive.

```bash
docker container run -it -p 8000:8080 --name hello_rest speedrun/hello_rest
# -d for background running.
```
