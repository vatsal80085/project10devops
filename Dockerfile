# Use official Tomcat image with JDK 8
FROM tomcat:9.0-jdk8-openjdk

# Remove default Tomcat applications
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy the WAR file to Tomcat webapps directory
COPY target/JavaApp.war /usr/local/tomcat/webapps/ROOT.war

# Expose port 8080
EXPOSE 8080

# Add metadata
LABEL maintainer="Group 10 - Advanced Text Analysis Tool"
LABEL description="Java Web Application for Text Analysis"
LABEL version="1.0"

# Start Tomcat
CMD ["catalina.sh", "run"]
