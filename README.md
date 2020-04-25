Basic CRUD with Spring Boot and PostgreSQL
==========================================

* This CRUD has an API RESTfull built with Java using the framework Spring Boot.
* This API not intend to be a complet project using all good practices of the project.

## Requirements

* **Java 11**

## Build

```bash
Create a data base with the name 'apiproduct' into the PostegreSQL on the user postgres.
```

```bash
Insert the password into the 'apiproduct/src/main/resources/application.properties' 
according with the user postgres password on local data base.
```

```bash
Execute 'mvn spring-boot:run' into the termial
```

## Testing the API

```bash
Install the postman or equivalent
```
* [Download](https://www.postman.com/downloads/) the Postman

## URIs

* **GET ALL**

```bash
http://localhost:8080/api/produtos
```

* **GET to id**

```bash
http://localhost:8080/api/produto/{id}
```

* **POST**

```bash
http://localhost:8080/api/produto
```

* **PUT**

```bash
http://localhost:8080/api/produto/{id}
```

* **DELETE**

```bash
http://localhost:8080/api/produto/{id}
```
