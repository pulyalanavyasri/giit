# Use the same Java version we saw in your System Audit (OpenJDK 17)
FROM openjdk:17-jdk-slim

# Maven puts the finished JAR file in the 'target' folder
# This line copies it into the Docker image
COPY target/*.jar app.jar

# This tells Docker how to run your application
ENTRYPOINT ["java", "-jar", "/app.jar"]
