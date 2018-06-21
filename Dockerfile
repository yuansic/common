# Pull base image
FROM 10.19.13.36:5000/jdk:7
MAINTAINER auth<auth@yourcompany.com>

# deploy user dubbo service
COPY ./build/libs /dubbo-service/libs/
COPY ./build/config /dubbo-service/config/

#mkdir logs path
RUN cd /dubbo-service && mkdir logs && cd /dubbo-service/logs

## copy start script
COPY ./script/start-dubbo-service.sh /start-dubbo-service.sh
COPY ./script/start-cache-service.sh /start-cache-service.sh
RUN chmod 755 /*.sh

# Expose dubbo/rest ports.
EXPOSE 10881

# Define default command.
CMD ["./start-dubbo-service.sh"]