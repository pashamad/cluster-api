FROM gradle:7.3-jdk11-alpine AS build
RUN apk add protoc
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM openjdk:11-jre-slim
EXPOSE 8080
WORKDIR /app
COPY --from=build /home/gradle/src/build/libs/cluster-api-SNAPSHOT.jar cluster-api.jar
ENTRYPOINT ["java", "-jar", "/app/cluster-api.jar"]
