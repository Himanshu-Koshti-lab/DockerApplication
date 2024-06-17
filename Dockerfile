FROM bladex/alpine-java:openjdk17_cn_slim

RUN addgroup -S app && adduser -S app -G app

USER app

COPY target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]