FROM openjdk:11
ADD /build/libs/thisevent-0.0.1-SNAPSHOT.jar thisevent.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "thisevent.jar"]