FROM openjdk:11-jre-slim
MAINTAINER bobikov_ivan
ARG JAR_FILE=target/*.jar
COPY drones/${JAR_FILE} drones.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/drones.jar"]