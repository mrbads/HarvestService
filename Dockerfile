FROM openjdk:17

ARG JAR_FILE=target/app.jar
COPY ${JAR_FILE} /app.jar
RUN echo "java \$@ -jar /app.jar" > /entrypoint.sh
ENTRYPOINT ["/bin/sh", "/entrypoint.sh"]