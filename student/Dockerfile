FROM openjdk:8-jdk-stretch
# A simple dockerfile to provide gnu netcat.
RUN apt-get update && apt-get -y install netcat && apt-get clean
ADD target/student.jar student.jar
EXPOSE 2018
ENTRYPOINT [ "/bin/sh" ]