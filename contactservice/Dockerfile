#Contact service

FROM openjdk:17.0.2-oracle
WORKDIR /project/app
COPY ./target/contactservice-0.0.1-SNAPSHOT.jar contactservice.jar
EXPOSE 9011
ENV MONGO_DB=contacts_docker_db
ENV EUREKA_HOST=discoveryservice
ENV MONGO_HOST=localmongo
ENTRYPOINT ["java","-jar","contactservice.jar"]




#Docker port mapping : 9012

#docker build -t contactservice:1.0 .

#docker run --name contactservice --network=data -p 9012:9011 contactservice:1.0