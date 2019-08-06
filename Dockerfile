FROM openjdk:8-jre

LABEL maintainer="jizhe@live.cn"
LABEL description="This is Java Demo"

WORKDIR /app

COPY ./target/demo.jar /app/demo.jar

ENTRYPOINT [ "sh", "-c", "java -Dspring.profiles.active=$PROJECT_ENV -jar demo.jar"]
EXPOSE 8080

