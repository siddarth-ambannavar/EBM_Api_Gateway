FROM openjdk:17

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} ApiGateway-0.0.1.jar

ENTRYPOINT ["java", "-jar", "/ApiGateway-0.0.1.jar"]

EXPOSE 8086