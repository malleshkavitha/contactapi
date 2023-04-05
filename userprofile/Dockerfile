#UserProfileService

FROM openjdk:17.0.2-oracle
WORKDIR /project/app
COPY ./target/userprofile-0.0.1-SNAPSHOT.jar userprofile.jar
EXPOSE 9001
ENV MYSQL_DB=user_docker_db
ENV JWT_SECRET=secretkey
ENV EUREKA_HOST=discoveryservice
ENV MYSQL_HOST=localmysql
ENV MYSQL_ROOT_PASSWORD=pass123
ENTRYPOINT ["java","-jar","userprofile.jar"]

#openjdk:11-jre-slim

#Docker port mapping : 9002

#docker build -t userservice:1.0 .

#docker run --name userservice --network=data -p 9002:9001 userservice:1.0 -e MYSQL_ROOT_PASSWORD=pass123

#docker run --name userservice --network=data -p 9002:9001 userservice:1.0