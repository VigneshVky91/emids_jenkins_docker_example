FROM openjdk
EXPOSE 9000
ADD /target/emids_jenkins-docker-example.jar /emids_jenkins-docker-example.jar
ENTRYPOINT ["java", "-jar", "emids_jenkins-docker-example.jar"]