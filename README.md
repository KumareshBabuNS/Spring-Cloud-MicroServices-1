# Spring-Cloud [![Build Status](https://travis-ci.org/izhangzhihao/Spring-Cloud-MicroServices.svg?branch=master)](https://travis-ci.org/izhangzhihao/Spring-Cloud-MicroServices)
[![](https://images.microbadger.com/badges/image/izhangzhihao/spring-cloud.svg)](https://hub.docker.com/r/izhangzhihao/spring-cloud/) [![](https://images.microbadger.com/badges/version/izhangzhihao/spring-cloud.svg)](https://hub.docker.com/r/izhangzhihao/spring-cloud/)

#  运行EurekaServer
    docker run -i -t -p 127.0.0.1:8000:8000  --name EurekaServer izhangzhihao/spring-cloud

# 配置
    配置中心 端口号 8000
    注册中心 端口号 9000
    服务网关 端口号 7000
    Movie-Service 端口号 6000
    LoadBalance-Service 端口号 5000