FROM java
MAINTAINER izhangzhihao "izhangzhihao@hotmail.com"
RUN cd /home/
RUN wget https://services.gradle.org/distributions/gradle-3.1-bin.zip
RUN unzip gradle-3.1-bin.zip
RUN git clone https://github.com/izhangzhihao/Spring-Cloud.git
RUN cd Spring-Cloud
RUN /home/gradle-3.1/bin/gradle bootRepackage
RUN java -jar build/libs/EurekaServer-1.0-SNAPSHOT.jar --spring.profiles.active=EurekaServer1
EXPOSE 8000