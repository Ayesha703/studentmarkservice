FROM eclipse-temurin:21-jre
COPY target/studentmarkservice-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8100
ENTRYPOINT ["java","-jar","app.jar"]
