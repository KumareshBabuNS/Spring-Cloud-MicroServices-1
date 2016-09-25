# Spring-Cloud
[![](https://images.microbadger.com/badges/image/izhangzhihao/spring-cloud.svg)](https://hub.docker.com/r/izhangzhihao/spring-cloud/) [![](https://images.microbadger.com/badges/version/izhangzhihao/spring-cloud.svg)](https://hub.docker.com/r/izhangzhihao/spring-cloud/)

#  运行EurekaServer
    docker run -i -t -p 127.0.0.1:8000:8000  --name EurekaServer izhangzhihao/spring-cloud
    然后等待gradle下载完依赖后运行
    java -jar /home/Spring-Cloud/EurekaServer/build/libs/EurekaServer-1.0-SNAPSHOT.jar --spring.profiles.active=EurekaServer1 
