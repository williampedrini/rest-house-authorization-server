FROM openjdk:12.0.1-jdk

MAINTAINER William Custodio

ARG JAR_FILE

ENV AUTH_DATASOURCE_URL=''

ENV AUTH_DATASOURCE_USERNAME=''

ENV AUTH_DATASOURCE_PASSWORD=''

ENV AUTH_FLYWAY_SCRIPT_LOCATION=''

COPY $JAR_FILE authorization-server.jar

ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom -jar authorization-server.jar