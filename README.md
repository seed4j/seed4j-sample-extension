# JHLite Extension Sample

[![Build Status][github-actions-image]][github-actions-url]

## Prerequisites

### Java

You need to have Java 21:

- [JDK 21](https://openjdk.java.net/projects/jdk/21/)

### Node.js and NPM

Before you can build this project, you must install and configure the following dependencies on your machine:

[Node.js](https://nodejs.org/): We use Node to run a development web server and build the project.
Depending on your system, you can install Node either from source or as a pre-packaged bundle.

After installing Node, you should be able to run the following command to install development tools.
You will only need to run this command when dependencies change in [package.json](package.json).

```
npm install
```

## Local environment

<!-- jhipster-needle-localEnvironment -->

## Start up

```bash
./mvnw
```

```bash
docker compose -f src/main/docker/sonar.yml up -d
```

```bash
./mvnw clean verify sonar:sonar
```

<!-- jhipster-needle-startupCommand -->

## Documentation

- [Package types](documentation/package-types.md)
- [Assertions](documentation/assertions.md)
- [Module creation](documentation/module-creation.md)
- [Cucumber](documentation/cucumber.md)
- [Hexagonal architecture](documentation/hexagonal-architecture.md)
- [sonar](documentation/sonar.md)

<!-- jhipster-needle-documentation -->

[github-actions-image]: https://github.com/seed4j/seed4j-sample-extension/workflows/build/badge.svg
[github-actions-url]: https://github.com/seed4j/seed4j-sample-extension/actions
