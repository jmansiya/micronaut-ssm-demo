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

# Currently, I have this error:
09:17:31.870 [main] DEBUG i.m.context.DefaultBeanContext - Found concrete candidate [Definition: io.micronaut.discovery.eureka.EurekaConfiguration$EurekaRegistrationConfiguration] for type: io.micronaut.discovery.eureka.EurekaConfiguration$EurekaRegistrationConfiguration
Bean definition [io.micronaut.discovery.eureka.EurekaConfiguration] could not be loaded: Failed to inject value for parameter [embeddedServer] of class: io.micronaut.discovery.eureka.EurekaConfiguration$EurekaRegistrationConfiguration

Message: No bean of type [io.micronaut.runtime.server.EmbeddedServer] exists. Make sure the bean is not disabled by bean requirements (enable trace logging for 'io.micronaut.context.condition' to check) and if the bean is enabled then ensure the class is declared a bean and annotation processing is enabled (for Java and Kotlin the 'micronaut-inject-java' dependency should be configured as an annotation processor).
Path Taken: new EurekaConfiguration(EurekaConnectionPoolConfiguration eurekaConnectionPoolConfiguration,ApplicationConfiguration applicationConfiguration,[EurekaRegistrationConfiguration eurekaRegistrationConfiguration]) --> new EurekaRegistrationConfiguration([EmbeddedServer embeddedServer],ApplicationConfiguration applicationConfiguration,DataCenterInfo dataCenterInfo,String appName,String hostname,Integer port,String ipAddr,String instanceId,Boolean preferIpAddress): io.micronaut.context.exceptions.BeanInstantiationException
io.micronaut.context.exceptions.BeanInstantiationException: Bean definition [io.micronaut.discovery.eureka.EurekaConfiguration] could not be loaded: Failed to inject value for parameter [embeddedServer] of class: io.micronaut.discovery.eureka.EurekaConfiguration$EurekaRegistrationConfiguration

Message: No bean of type [io.micronaut.runtime.server.EmbeddedServer] exists. Make sure the bean is not disabled by bean requirements (enable trace logging for 'io.micronaut.context.condition' to check) and if the bean is enabled then ensure the class is declared a bean and annotation processing is enabled (for Java and Kotlin the 'micronaut-inject-java' dependency should be configured as an annotation processor).
Path Taken: new EurekaConfiguration(EurekaConnectionPoolConfiguration eurekaConnectionPoolConfiguration,ApplicationConfiguration applicationConfiguration,[EurekaRegistrationConfiguration eurekaRegistrationConfiguration]) --> new EurekaRegistrationConfiguration([EmbeddedServer embeddedServer],ApplicationConfiguration applicationConfiguration,DataCenterInfo dataCenterInfo,String appName,String hostname,Integer port,String ipAddr,String instanceId,Boolean preferIpAddress)
at io.micronaut.context.DefaultBeanContext.initializeContext(DefaultBeanContext.java:1549)
at io.micronaut.context.DefaultApplicationContext.initializeContext(DefaultApplicationContext.java:220)
at io.micronaut.context.DefaultBeanContext.readAllBeanDefinitionClasses(DefaultBeanContext.java:2812)
at io.micronaut.context.DefaultBeanContext.start(DefaultBeanContext.java:233)
at io.micronaut.context.DefaultApplicationContext.start(DefaultApplicationContext.java:166)
at io.micronaut.function.executor.AbstractExecutor.startEnvironment(AbstractExecutor.java:125)
at io.micronaut.function.aws.MicronautRequestHandler.buildApplicationContext(MicronautRequestHandler.java:163)
at io.micronaut.function.aws.MicronautRequestHandler.<init>(MicronautRequestHandler.java:60)
at com.example.LambdaHandler.<init>(LambdaHandler.java:10)
at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)
at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)
at java.base/java.lang.reflect.Constructor.newInstance(Unknown Source)
Caused by: io.micronaut.context.exceptions.DependencyInjectionException: Failed to inject value for parameter [embeddedServer] of class: io.micronaut.discovery.eureka.EurekaConfiguration$EurekaRegistrationConfiguration

Message: No bean of type [io.micronaut.runtime.server.EmbeddedServer] exists. Make sure the bean is not disabled by bean requirements (enable trace logging for 'io.micronaut.context.condition' to check) and if the bean is enabled then ensure the class is declared a bean and annotation processing is enabled (for Java and Kotlin the 'micronaut-inject-java' dependency should be configured as an annotation processor).
Path Taken: new EurekaConfiguration(EurekaConnectionPoolConfiguration eurekaConnectionPoolConfiguration,ApplicationConfiguration applicationConfiguration,[EurekaRegistrationConfiguration eurekaRegistrationConfiguration]) --> new EurekaRegistrationConfiguration([EmbeddedServer embeddedServer],ApplicationConfiguration applicationConfiguration,DataCenterInfo dataCenterInfo,String appName,String hostname,Integer port,String ipAddr,String instanceId,Boolean preferIpAddress)
at io.micronaut.context.AbstractBeanDefinition.getBeanForConstructorArgument(AbstractBeanDefinition.java:1035)
at io.micronaut.discovery.eureka.$EurekaConfiguration$EurekaRegistrationConfigurationDefinition.build(Unknown Source)
at io.micronaut.context.DefaultBeanContext.doCreateBean(DefaultBeanContext.java:1898)
at io.micronaut.context.DefaultBeanContext.createAndRegisterSingletonInternal(DefaultBeanContext.java:2679)
at io.micronaut.context.DefaultBeanContext.createAndRegisterSingleton(DefaultBeanContext.java:2665)
at io.micronaut.context.DefaultBeanContext.getBeanForDefinition(DefaultBeanContext.java:2337)
at io.micronaut.context.DefaultBeanContext.getBeanInternal(DefaultBeanContext.java:2311)
at io.micronaut.context.DefaultBeanContext.getBean(DefaultBeanContext.java:1245)
at io.micronaut.context.AbstractBeanDefinition.getBeanForConstructorArgument(AbstractBeanDefinition.java:1013)
at io.micronaut.discovery.eureka.$EurekaConfigurationDefinition.build(Unknown Source)
at io.micronaut.context.DefaultBeanContext.doCreateBean(DefaultBeanContext.java:1898)
at io.micronaut.context.DefaultBeanContext.createAndRegisterSingletonInternal(DefaultBeanContext.java:2679)
at io.micronaut.context.DefaultBeanContext.createAndRegisterSingleton(DefaultBeanContext.java:2665)
at io.micronaut.context.DefaultBeanContext.loadContextScopeBean(DefaultBeanContext.java:2204)
at io.micronaut.context.DefaultBeanContext.initializeContext(DefaultBeanContext.java:1543)
... 12 more
Caused by: io.micronaut.context.exceptions.NoSuchBeanException: No bean of type [io.micronaut.runtime.server.EmbeddedServer] exists. Make sure the bean is not disabled by bean requirements (enable trace logging for 'io.micronaut.context.condition' to check) and if the bean is enabled then ensure the class is declared a bean and annotation processing is enabled (for Java and Kotlin the 'micronaut-inject-java' dependency should be configured as an annotation processor).
at io.micronaut.context.DefaultBeanContext.getBeanInternal(DefaultBeanContext.java:2322)
at io.micronaut.context.DefaultBeanContext.getBean(DefaultBeanContext.java:1245)
at io.micronaut.context.AbstractBeanDefinition.getBeanForConstructorArgument(AbstractBeanDefinition.java:1013)
... 26 more

START RequestId: 96c883d2-779c-13a9-e4e2-ef00cdeb37d2 Version: $LATEST
END RequestId: 96c883d2-779c-13a9-e4e2-ef00cdeb37d2
REPORT RequestId: 96c883d2-779c-13a9-e4e2-ef00cdeb37d2  Init Duration: 18306.49 ms      Duration: 5.18 ms       Billed Duration: 100 ms Memory Size: 512 MB     Max Memory Used: 140 MB

{"errorType":"io.micronaut.context.exceptions.BeanInstantiationException","errorMessage":"Bean definition [io.micronaut.discovery.eureka.EurekaConfiguration] could not be loaded: Failed to inject value for parameter [embeddedServer] of class: io.micronaut.discovery.eureka.EurekaConfiguration$EurekaRegistrationConfiguration\n\nMessage: No bean of type [io.micronaut.runtime.server.EmbeddedServer] exists. Make sure the bean is not disabled by bean requirements (enable trace logging for 'io.micronaut.context.condition' to check) and if the bean is enabled then ensure the class is declared a bean and annotation processing is enabled (for Java and Kotlin the 'micronaut-inject-java' dependency should be configured as an annotation processor).\nPath Taken: new EurekaConfiguration(EurekaConnectionPoolConfiguration eurekaConnectionPoolConfiguration,ApplicationConfiguration applicationConfiguration,[EurekaRegistrationConfiguration eurekaRegistrationConfiguration]) --\u003e new EurekaRegistrationConfiguration([EmbeddedServer embeddedServer],ApplicationConfiguration applicationConfiguration,DataCenterInfo dataCenterInfo,String appName,String hostname,Integer port,String ipAddr,String instanceId,Boolean preferIpAddress)"}

