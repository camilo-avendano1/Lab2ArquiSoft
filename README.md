Implementation of a Simple App with the next operations:


[![CI/CD Pipeline](https://github.com/camilo-avendano1/Lab2ArquiSoft/actions/workflows/build.yml/badge.svg)](https://github.com/camilo-avendano1/Lab2ArquiSoft/actions/workflows/build.yml)

[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=camilo-avendano1_Lab2ArquiSoft&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=camilo-avendano1_Lab2ArquiSoft)

[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=camilo-avendano1_Lab2ArquiSoft&metric=coverage)](https://sonarcloud.io/summary/new_code?id=camilo-avendano1_Lab2ArquiSoft)

[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=camilo-avendano1_Lab2ArquiSoft&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=camilo-avendano1_Lab2ArquiSoft)

[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=camilo-avendano1_Lab2ArquiSoft&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=camilo-avendano1_Lab2ArquiSoft)

[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=camilo-avendano1_Lab2ArquiSoft&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=camilo-avendano1_Lab2ArquiSoft)

[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=camilo-avendano1_Lab2ArquiSoft&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=camilo-avendano1_Lab2ArquiSoft)


* Get random nations

* Get random currencies

* Get application version

* health check

 

Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk

 

### Folders Structure

 

In the folder `src` is located the main code of the app

 

In the folder `test` is located the unit tests

 

### How to install it

 

Execute:

 

```shell

$ mvnw spring-boot:run

```

to download the node dependencies

 

### How to test it

 

Execute:

 

```shell

$ mvnw clean install

```

 

### How to get coverage test

 

Execute:

 

```shell

$ mvwn -B package -DskipTests --file pom.xml

```
