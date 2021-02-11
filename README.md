## Micronaut 2.3.1 Documentation

- [User Guide](https://docs.micronaut.io/2.3.1/guide/index.html)
- [API Reference](https://docs.micronaut.io/2.3.1/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/2.3.1/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Handler

[AWS Lambda Handler](https://docs.aws.amazon.com/lambda/latest/dg/java-handler.html)

Handler: io.micronaut.function.aws.proxy.MicronautLambdaHandler

## Feature aws-lambda documentation

- [Micronaut AWS Lambda Function documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/index.html#lambda)

## Feature aws-lambda-custom-runtime documentation

- [Micronaut Custom AWS Lambda runtime documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/index.html#lambdaCustomRuntimes)

- [https://docs.aws.amazon.com/lambda/latest/dg/runtimes-custom.html](https://docs.aws.amazon.com/lambda/latest/dg/runtimes-custom.html)

## RUN THIS DEMO

- mvn clean install
- sam local invoke -t template.yaml -e event.json

## Generate Native version:

- Execute: deploy.sh
- sam local invoke -t templateNative.yaml -e event.json