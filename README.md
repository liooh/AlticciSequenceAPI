# How to run the application?

In the project there are a **Dockerfile** and a **docker-compose** file, then it's necessary to has the Docker installed on your machine. Considering you have the docker and docker-compose installed on your machine, what you need to do is go to the root of the project, and run:

```
docker compose up -d
```

For to access, use the URL: `http://localhost:9000/alticci-sequence-api/`

The swagger doc is available on: `http://localhost:9000/alticci-sequence-api/swagger-ui.html`

The endpoint for get the alticci sequence is: `http://localhost:9000/alticci-sequence-api/alticci-sequence/alticci/{n}`

# Client Web / Postman

A web client using Angular was developed. Considering you have the docker and docker-compose installed on your machine. Clone or execute download the project in `https://github.com/liooh/AlticciSequenceWeb` and on the root of the project, run the command below:

```
docker compose up -d
```
And access `http://localhost:8080`

Other option is user a **Postman** client for testing the endpoint.

# Tools

- Java 8
- Springboot
- Angular
- Mysql
- Swagger
- JUnit

# About the solution concepts

For to solve the problem has been used dynamic program concepts for to save in the memory (ram and disk) sequence value previous calculated. With this, it's possible of cutting expanded trees many times and economize resource like memory and CPU.