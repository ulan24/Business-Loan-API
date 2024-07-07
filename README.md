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



## Usage

# Submitting a Loan Application

To submit a new loan application, send a POST request to `/api/v1/customers/saveDetails` with the required parameters in the request body.

Example request:

```http
POST /api/v1/customers/saveDetails
Content-Type: application/json

{
    "BorrowerDetails": {
        "Customer Type": "Business",
        "TIN": "456711899",
        "First Name": "Flora",
        "Middle Name": "Davinci",
        "Last Name": "Fin",
        "Business Legal Name": "Blooming Flowers",
        "Email": "flora@gmail.com",
        "Contact No": "34907689128",
        "Date of Birth": "1985-07-24",
        "Amount": 200000
    },
    "BusinessDetails": {
        "Established Date": "2021-10-24",
        "State Of Incorporation": "Karnataka",
        "Number Of Employees": 150,
        "Nature Of Business": "Retail",
        "Amount": 12000000,
        "NAICS Code": "44-45"
    },
    "Address": {
        "Address Line 1": "135 Valley lake dr",
        "Address Line 2": "Suite 456",
        "City": "Atlanta",
        "State": "California",
        "Zipcode": "000234"
    },
    "ProductDetails": {
        "Product Type": "Start Up Business Loan",
        "Purpose Of Loan": "Expansion/Increase Working Capital",
        "Amount": 500000,
        "Business Title": "Flowers",
        "Number Of Terms": 12
    },
    "Guarantor": [
        {
            "TIN": "457623",
            "Legal Name": "FaunaCare",
            "Guranter Type": "Individual",
            "Ownership Percentage": 33.3
        }
    ],
    "SecurityDetails": [
        {
            "Collateral Type": "Real Estate",
            "Collateral Details": "Shares",
            "Amount": 450000
        }
    ]
}
```

Example response:

```json
{
Same JSON with a status code of 201 Created
}
```

## Retrieving Application Status

To check the status of a loan application, send a GET request to 
`/api/v1/customers/getDetails/{customerId}`.

Example request:

```http
GET /api/v1/customers/getDetails/72a21254-b2f1-4496-a9d5-4f9dd4545fef
```

Example response:

```json
{
  "applicationId": "123456789",
  "status": "pending",
  "amount": 10000,
  "applicantName": "John Doe",
  "businessName": "ABC Inc."
}
```

## Configuration

Configure the application properties (`application.properties` or `application.yml`)  for database 
settings, server port, and other configurations.

## Test

To run tests, use the following command:

```bash
   mvn test
```
