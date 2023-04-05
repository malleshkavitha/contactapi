#Apigateway service

FROM openjdk:17.0.2-oracle
WORKDIR /project/app
COPY ./target/apigateway-0.0.1-SNAPSHOT.jar apigateway.jar
EXPOSE 8765
ENV JWT_SECRET=secretkey
ENV EUREKA_HOST=discoveryservice
ENTRYPOINT ["java","-jar","apigateway.jar"]

#Docker port mapping : 8766

#docker build -t apigateway:1.0 . (you should be in a apigateway dir)

#docker run --name apigateway --network=data -p 8766:8765 apigateway:1.0