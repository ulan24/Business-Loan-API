# Business Loan API

## Overview

The Business Loan API is a Spring Boot application designed to facilitate managing business loan applications. It provides endpoints for submitting loan applications, checking application status, and managing loan details.

## Prerequisites

Before you begin, ensure you have the following installed:
- Java Development Kit (JDK) 17 or higher
- Maven (for dependency management and building the project)

## Installation

1. Clone the repository from GitHub:
   ```bash
   git clone https://github.com/yourusername/business-loan-api.git
2. Navigate into the project directory:
   ```bash
   cd business-loan-api
3. Build the project using Maven:
   ```bash
   mvn clean install
4. Start the application:
   ```bash
   mvn spring-boot:run

The API server will start running at `http://localhost:8080`.

## Dependencies

The following dependencies are used in this project:

```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <version>3.2.2</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
        <version>3.2.0</version>
    </dependency>
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.modelmapper</groupId>
        <artifactId>modelmapper</artifactId>
        <version>3.2.0</version>
    </dependency>
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-core</artifactId>
        <version>2.16.0</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>


## Usage

