FROM openjdk:21-oracle
COPY ./target/Author-Service-0.0.1-SNAPSHOT.jar Author-Service.jar
CMD ["java", "-jar", "Author-Service.jar"]