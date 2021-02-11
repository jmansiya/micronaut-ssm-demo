#!/bin/bash
./mvnw clean package
docker build . -t demo
mkdir -p build
docker run --rm --entrypoint cat demo /app/function.zip > build/function.zip