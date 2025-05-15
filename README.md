# My Java App

This is a simple Java application that demonstrates a basic "Hello, World!" program. The application is built using Maven and is configured to use Java version 23. It also includes unit tests and code coverage using JaCoCo.

## Project Structure

```
my-java-app
├── src
│   ├── main
│   │   └── java
│   │       └── App.java
│   └── test
│       └── java
│           └── AppTest.java
├── pom.xml
└── README.md
```

## Prerequisites

- Java 23
- Maven

## Building the Application

To build the application, navigate to the project directory and run:

```
mvn clean install
```

## Running the Application

To run the application, use the following command:

```
mvn exec:java -Dexec.mainClass="App"
```

## Running Tests

To execute the tests, run:

```
mvn test
```

## Code Coverage

To generate code coverage reports using JaCoCo, run:

```
mvn jacoco:report
```

The coverage report will be generated in the `target/site/jacoco` directory. Open the `index.html` file in a web browser to view the coverage report.

## License

This project is licensed under the MIT License.