FROM openjdk:8

WORKDIR /opt
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8761
EXPOSE 8762

ENTRYPOINT ["java","-jar","/opt/app.jar"]