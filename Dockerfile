FROM openjdk:17-oracle
MAINTAINER ilyas
COPY build/libs/serviceA-0.0.1-SNAPSHOT.jar servicea.jar
ENTRYPOINT ["java", "-jar", "servicea.jar"]