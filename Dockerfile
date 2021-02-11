FROM ghcr.io/graalvm/graalvm-ce:latest as graalvm
RUN gu install native-image

COPY . /home/app/application
WORKDIR /home/app/application

RUN native-image --no-server -cp target/demo-0.1.jar

FROM frolvlad/alpine-glibc
RUN apk update && apk add libstdc++ zip

# No rest api, so no port to expose
# EXPOSE 8080
COPY --from=graalvm /home/app/application/demo /app/demo
COPY --from=graalvm /home/app/application/bootstrap /app/bootstrap
WORKDIR /app
RUN chmod 777 bootstrap
RUN chmod 777 demo
RUN zip function.zip bootstrap demo

ENTRYPOINT ["/app/demo"]