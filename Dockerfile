FROM openjdk:11-jdk-oracle
EXPOSE 8080
ADD /build/libs/api-0.1.0-SNAPSHOT.jar api.jar
ENTRYPOINT ["java", "-jar", "api.jar"]
