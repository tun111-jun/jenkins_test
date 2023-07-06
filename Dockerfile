FROM openjdk:11-jdk
WORKDIR /app

COPY build/libs/uplog-0.0.1-SNAPSHOT.jar /app/uplog-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "-Dserver.port=8080", "/app/uplog-0.0.1-SNAPSHOT.jar"]