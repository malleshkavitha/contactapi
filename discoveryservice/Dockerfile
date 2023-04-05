#Discovery service

FROM openjdk:17.0.2-oracle
WORKDIR /project/app
COPY ./target/discoveryservice-0.0.1-SNAPSHOT.jar discoveryservice.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","discoveryservice.jar"]

#Docker port mapping : 8762


#Run Mongo and Mysql Database in a container by pulling the public image from the registery

# Mysql

##Pull the image from the registry(Docker hub)
#docker pull mysql:8.0.32
#docker images

#As all of the containers(services) should interact, they should run in the same network
## Creating the network
#docker network create data
#docker network ls

##Run the image
#docker run --name localmysql --network=data -p 3309:3306 -e MYSQL_ROOT_PASSWORD=pass123 -d mysql:8.0.32

#Volume mapping
#docker run --name localmysql -v mysql-data:/var/lib/mysql --network=data -p 3309:3306 -e MYSQL_ROOT_PASSWORD=pass123 -d mysql:8.0.31
#docker exec -i -t c088c9c9975b bash
#ls /var/lib/mysql

# Mongo
#docker pull mongo:6.0.3
#docker run --name localmongo --network=data -p 27018:27017 -d mongo:6.0.3

# To enter inside the mongo container
# docker exec -i -t <containerId> bash
# mongosh

# Discovery service

# Building image for discoveryservice
#docker build -t discoveryservice:1.0 .  (make sure you are in a discoveryservice dir)

#docker run --name discoveryservice --network=data -p 8762:8761 discoveryservice:1.0