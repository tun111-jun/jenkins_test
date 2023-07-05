FROM openjdk:11-jdk
LABEL authors="ASUS"
ARG JAR_FILE=build/libs/uplog-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} uplog.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/uplog.jar"]