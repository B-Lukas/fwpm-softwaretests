FROM openjdk:11-jdk-slim
LABEL maintainer="Lukas Biernat"

COPY target/FWPM-Softwaretests-1.0-SNAPSHOT.jar /opt/application/FWPM-Softwaretests-1.0-SNAPSHOT.jar
WORKDIR /opt/application

CMD ["java","-jar","/opt/application/FWPM-Softwaretests-1.0-SNAPSHOT.jar"]
