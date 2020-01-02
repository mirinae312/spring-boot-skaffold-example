FROM openjdk:11.0.5-jdk

WORKDIR /
EXPOSE 8080

COPY target/*.jar /app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]