FROM adoptopenjdk/openjdk11:ubi
EXPOSE 8080
ARG JAR_FILE=target/rollingstock-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} .
CMD [ "java", "-jar",  "/rollingstock-0.0.1-SNAPSHOT.jar"]