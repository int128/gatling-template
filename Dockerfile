FROM adoptopenjdk:11-jdk-hotspot

ADD target/universal/hello-gatling-latest.tgz /app/
COPY docker/ /app/hello-gatling-latest/

ENTRYPOINT ["/app/hello-gatling-latest/bin/gatling.sh"]
