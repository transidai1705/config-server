# The Dockerfile build assumes that the application already built using: mvn package -DskipTests=true
# Build image: docker build -t config-server .
# Run container: docker run -it -p 8888:8888 --name config-server config-server

FROM openjdk:8
COPY . /code/
RUN echo "Remove old build artifact & rebuild the application" && \
	cd /code/ && \
	mv target/config-server-*.jar /config-server.jar

FROM openjdk:8-jre-alpine
ENV JAVA_OPTS=""
EXPOSE 8888
CMD java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /config-server.jar
COPY --from=0 /config-server.jar .