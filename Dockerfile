FROM openjdk:17

COPY target/salones-*.jar /app/salones.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/salones.jar"]


