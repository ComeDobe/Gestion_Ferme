## Start with a base image containing Java runtime (OpenJDK 11)
#FROM openjdk:11-jdk-slim as builder
#
## The application's .jar file will reside inside /app
#WORKDIR /app
#
## Package the application
#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#COPY src ./src
#
## Package the application
#RUN ./mvnw package -DskipTests
#
## Runtime stage
#FROM openjdk:11-jre-slim
#
#WORKDIR /app
#
## Copy the jar file built in the builder stage
#COPY --from=builder /app/target/Ferme-0.0.1-SNAPSHOT.war Ferme.war
#
## Expose the port
#EXPOSE 8080
#
## Run the application
#ENTRYPOINT ["java", "-jar", "Ferme.war"]
#


# Use Tomcat version 8.5 as the base
FROM tomcat:8.5
# Copy the WAR file to the Tomcat webapps directory
COPY target/Ferme-0.0.1-SNAPSHOT.jar /usr/local/tomcat/webapps/ROOT.jar
# Use the Catalina script to run Tomcat
CMD ["/usr/local/tomcat/bin/catalina.sh", "run"]
