FROM ubuntu:latest AS build
RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .
RUN ./gradlew bootJar --no-daemon

FROM openjdk:17-jdk-slim
EXPOSE 8080
COPY --from=build /build/libs/email-spot-0.0.1-SNAPSHOT.jar email-spot.jar
ENTRYPOINT ["java", "-jar", "/email-spot.jar"]