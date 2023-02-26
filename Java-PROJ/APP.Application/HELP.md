# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.3/maven-plugin/reference/html/#build-image)
* [GraalVM Native Image Support](https://docs.spring.io/spring-boot/docs/3.0.3/reference/html/native-image.html#native-image)
* [Azure MySQL support](https://aka.ms/spring/msdocs/mysql)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.3/reference/htmlsingle/#web)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/3.0.3/reference/htmlsingle/#howto.data-access.exposing-spring-data-repositories-as-rest)
* [Spring for GraphQL](https://docs.spring.io/spring-boot/docs/3.0.3/reference/html/web.html#web.graphql)
* [Spring Web Services](https://docs.spring.io/spring-boot/docs/3.0.3/reference/htmlsingle/#io.webservices)
* [Spring Security](https://docs.spring.io/spring-boot/docs/3.0.3/reference/htmlsingle/#web.security)
* [JDBC API](https://docs.spring.io/spring-boot/docs/3.0.3/reference/htmlsingle/#data.sql)
* [Spring Data JDBC](https://docs.spring.io/spring-boot/docs/3.0.3/reference/htmlsingle/#data.sql.jdbc)
* [Java Mail Sender](https://docs.spring.io/spring-boot/docs/3.0.3/reference/htmlsingle/#io.email)
* [Spring Cloud Azure developer guide](https://aka.ms/spring/msdocs/developer-guide)
* [Azure Storage](https://microsoft.github.io/spring-cloud-azure/current/reference/html/index.html#resource-handling)
* [Azure Key Vault](https://microsoft.github.io/spring-cloud-azure/current/reference/html/index.html#secret-management)
* [Azure Active Directory](https://microsoft.github.io/spring-cloud-azure/current/reference/html/index.html#spring-security-with-azure-active-directory)
* [Spring Data MongoDB](https://docs.spring.io/spring-boot/docs/3.0.3/reference/htmlsingle/#data.nosql.mongodb)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.0.3/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/docs/3.0.3/reference/htmlsingle/#web.reactive)
* [Spring Session](https://docs.spring.io/spring-session/reference/)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.3/reference/htmlsingle/#using.devtools)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.0.3/reference/htmlsingle/#appendix.configuration-metadata.annotation-processor)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)
* [Building a GraphQL service](https://spring.io/guides/gs/graphql-server/)
* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)
* [Managing Transactions](https://spring.io/guides/gs/managing-transactions/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)
* [Deploying a Spring Boot app to Azure](https://spring.io/guides/gs/spring-boot-for-azure/)
* [How to use the Spring Boot starter for Azure Storage](https://aka.ms/spring/msdocs/storage)
* [Read Secrets from Azure Key Vault in a Spring Boot Application](https://aka.ms/spring/msdocs/keyvault)
* [Securing Spring Boot Applications with Azure Key Vault Certificates](https://aka.ms/spring/msdocs/keyvault/certificates)
* [Securing a Java Web App with the Spring Boot Starter for Azure Active Directory](https://aka.ms/spring/msdocs/aad)
* [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)

### Additional Links
These additional references should also help you:

* [Configure AOT settings in Build Plugin](https://docs.spring.io/spring-boot/docs/3.0.3/maven-plugin/reference/htmlsingle/#aot)
* [Azure Samples](https://aka.ms/spring/samples)
* [Azure Storage Sample](https://aka.ms/spring/samples/latest/storage)
* [Azure Key Vault Sample](https://aka.ms/spring/samples/latest/keyvault)
* [Azure Active Directory Sample](https://aka.ms/spring/samples/latest/aad)

## GraalVM Native Support

This project has been configured to let you generate either a lightweight container or a native executable.
It is also possible to run your tests in a native image.

### Lightweight Container with Cloud Native Buildpacks
If you're already familiar with Spring Boot container images support, this is the easiest way to get started.
Docker should be installed and configured on your machine prior to creating the image.

To create the image, run the following goal:

```
$ ./mvnw spring-boot:build-image -Pnative
```

Then, you can run the app like any other container:

```
$ docker run --rm -p 8080:8080 PI04:0.0.1-SNAPSHOT
```

### Executable with Native Build Tools
Use this option if you want to explore more options such as running your tests in a native image.
The GraalVM `native-image` compiler should be installed and configured on your machine.

NOTE: GraalVM 22.3+ is required.

To create the executable, run the following goal:

```
$ ./mvnw native:compile -Pnative
```

Then, you can run the app as follows:
```
$ target/PI04
```

You can also run your existing tests suite in a native image.
This is an efficient way to validate the compatibility of your application.

To run your existing tests in a native image, run the following goal:

```
$ ./mvnw test -PnativeTest
```

