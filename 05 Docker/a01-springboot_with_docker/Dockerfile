FROM openjdk:25-slim-bullseye
ADD target/rest-demo.jar rest-demo.jar
ENTRYPOINT [ "java", "-jar", "/rest-demo.jar" ]
 

# docker build -t telusko/rest-demo:v3 .

# docker run -p 8081:8080 telusko/rest-demo:v3