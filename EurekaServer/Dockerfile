FROM java
MAINTAINER izhangzhihao "izhangzhihao@hotmail.com"
RUN cd /home/ && wget https://services.gradle.org/distributions/gradle-3.1-bin.zip && unzip gradle-3.1-bin.zip && export GRADLE_HOME=/home/gradle-3.1 && export PATH=$PATH:$GRADLE_HOME/bin
RUN cd /home/ && git clone https://github.com/izhangzhihao/Spring-Cloud.git
RUN cd /home/Spring-Cloud/EurekaServer && /home/gradle-3.1/bin/gradle bootRepackage
RUN cd /home/Spring-Cloud/EurekaServer/build/libs && java -jar EurekaServer-1.0-SNAPSHOT.jar --spring.profiles.active=EurekaServer1
EXPOSE 8000