FROM gcr.io/distroless/java:11

ARG GIT_COMMIT="unspecified"
LABEL git_commit=${GIT_COMMIT}

COPY --chown=65534 target/quarkus-app/lib/ /app/lib/
COPY --chown=65534 target/quarkus-app/*.jar /app/app.jar
COPY --chown=65534 target/quarkus-app/app/ /app/app/
COPY --chown=65534 target/quarkus-app/quarkus/ /app/quarkus/

EXPOSE 8080

CMD ["/app/app.jar"]