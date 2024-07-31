
FROM eclipse-temurin:17-jre


COPY /target/CatalogDemo-0.0.1-SNAPSHOT.jar /app/catalog.jar

ENTRYPOINT ["java", "-jar", "/app/catalog.jar"]
