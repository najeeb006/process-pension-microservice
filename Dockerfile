FROM openjdk:17
EXPOSE 9000
COPY . .
ADD target/process-pension-microservice-0.0.1-SNAPSHOT.jar process-pension-microservice-latest
ENTRYPOINT ["java","-jar","/process-pension-microservice-latest"]