FROM gradle:7.3-jdk11-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN ./gradlew build --no-daemon

FROM openjdk:11-jre-slim
EXPOSE 8080
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/cluster-api-SNAPSHOT.jar /app/cluster-api.jar
ENTRYPOINT ["java", "-jar", "/app/cluster-api.jar"]
