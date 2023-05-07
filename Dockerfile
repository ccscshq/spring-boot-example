FROM amazoncorretto:17 AS builder
WORKDIR /app
COPY gradle.* gradlew /app/
COPY gradle/ /app/gradle/
RUN ./gradlew --version
COPY *.gradle /app/
RUN ./gradlew build -x test --continue > /dev/null 2>&1 || true

COPY . /app
RUN ./gradlew build -x test

FROM amazoncorretto:17
COPY --from=builder /app/build/libs/example-0.1.0.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
