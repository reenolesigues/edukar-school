FROM adoptopenjdk/openjdk11
ARG JAR_FILE=build/libs/edukar-school-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /edukar-school.jar
ENTRYPOINT ["java","-jar","edukar-school.jar"]