FROM java:8
VOLUME /docker/dataOfSpringbootDocker
ADD springboot-docker-0.0.1-SNAPSHOT.jar springboot-docker.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","springboot-docker.jar"]