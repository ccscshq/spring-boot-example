# spring-boot-example

## Running apps

```shell
./gradlew bootRun
```

## Building the docker image using jib

```shell
./gradlew jibDockerBuild
```

## Running apps with Docker Compose

```shell
docker compose up -d
```

or

```shell
docker-compose up -d
```

## Push the image to ECR

```shell
export ECR_REPOSITORY={ecr_repository_url}
./gradlew jib
```
