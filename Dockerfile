#pulling java11 image from docker hub
FROM adoptopenjdk/openjdk11

LABEL mentainer="nagendra.kumar@gmail.com"
#this folder is created inside docker container
WORKDIR /technohunk444

COPY target/auth-service-boot2x.war /technohunk444/auth-service-boot2x.war

ENTRYPOINT ["java", "-jar", "/technohunk444/auth-service-boot2x.war"]
