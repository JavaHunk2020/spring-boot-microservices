#pulling java11 image from docker hub
FROM adoptopenjdk/openjdk11

#Installing maven inside docker container
FROM maven:alpine

LABEL mentainer="nagendra.kumar@gmail.com"
#this folder is created inside docker container
WORKDIR /technohunk444

#Copy all the files from current project inside docker container /technohunk444
COPY . /technohunk444

# mvn command will run inside technohunk444 folder inside docker
//technohunk444/target/auth-service-boot2x.war
RUN mvn clean package -DskipTests

#cp command is running inside container
#technohunk444/target/auth-service-boot2x.war ->> /technohunk444/auth-service-boot2x.war
RUN cp  target/auth-service-boot2x.war  auth-service-boot2x.war

expose 8080

ENTRYPOINT ["java", "-jar", "auth-service-boot2x.war"]
