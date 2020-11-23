FROM java:8

EXPOSE 8088

ADD target/Docker-K8S-Example.jar Docker-K8S-Example.jar

ENTRYPOINT ["java","-jar","Docker-K8S-Example.jar"]
