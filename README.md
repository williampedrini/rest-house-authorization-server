# Rest House API

This project contains the representation of a authorization server, responsible for generating tokens, managing users and also their authorities.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

What things you need to install the software and how to install them:

```
Java 12
Gradle 5.5
Lombok Plugin 1.18.6 
```

#### INSTALLING

Install the tool for managing parallel versions of multiple Software Development Kits [SDK MAN](https://sdkman.io/install).

##### JAVA

Execute the following command:

```
sdk install java 12.0.1-sapmchn
```

##### GRADLE

Execute the following command:

```
sdk install gradle 5.5
```

##### DOCKER

1. Download [Docker](https://www.docker.com/products/docker-desktop)

2. Follow the instructions provided by the wizard.

#### Lombok Plugin

Please follow the steps defined on the following links, depending on your IDEA.

* [Lombok Eclipse](https://projectlombok.org/setup/eclipse) - Installing lombok on Eclipse.
* [Lombok Intellij](https://projectlombok.org/setup/intellij) - Installing lombok on Intellij.

### Running in Development Mode

To run the API execute the following command:

```
 gradle -Penvironment=development bootRun
```

## Publishing Images to Docker Hub

1. Log in into docker using the following command:

    ```
    docker login
    ```

2. Publish the new Image using the following command:

    ```
    gradle dockerPush
    ```

## Running Tests

1) Import the Postman [local](postman/local.environment.json) environment.
2) Import the Postman [authorization](postman/collection.json) collection.

#### Token Generation

Perform a call to generate the authorization token via Authorization -> Generate Token. The result must follow the pattern below:

```
{
    "access_token": "c53edc32-51a3-4666-b8d6-8fb4d521f586",
    "token_type": "bearer",
    "refresh_token": "bf4b311e-16ca-4eb0-b4fc-f6b6e496739f",
    "expires_in": 10799,
    "scope": "read write"
}
```

#### Token Check

Perform a call to check if a certain token is valid or not using the token generated by the previous test via Authorization -> Check Token. The result must follow the pattern below:

```
{
    "aud": [
        "RestHouseResourceApiId"
    ],
    "user_name": "admin",
    "scope": [
        "read",
        "write"
    ],
    "active": true,
    "exp": 1552260382,
    "authorities": [
        "CUSTOMER_DELETE",
        "OUTCOME_UPDATE",
        "PRODUCT_CREATE",
        "PRODUCT_UPDATE",
        "OUTCOME_READ",
        "OUTCOME_CREATE",
        "OUTCOME_DELETE",
        "CUSTOMER_CREATE",
        "PRODUCT_DELETE",
        "CUSTOMER_READ",
        "PRODUCT_READ",
        "CUSTOMER_UPDATE"
    ],
    "client_id": "RestHouseClientId"
}
```