FROM oracle/openjdk:8

WORKDIR /opt
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8091

ENTRYPOINT ["java","-jar","/opt/app.jar"]