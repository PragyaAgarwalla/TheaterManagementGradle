FROM openjdk:12-jdk-alpine
EXPOSE 8080
ADD /build/libs/TheaterManagementGradle-0.0.1-SNAPSHOT.war app.war
ENTRYPOINT ["java", "-jar", "app.war"]