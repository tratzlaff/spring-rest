# spring-rest
https://spring.io/guides/gs/rest-service/

## What does this sample service do?

The service will handle GET requests for /greeting, optionally with a name parameter in the query string. 
The GET request should return a 200 OK response with JSON in the body that represents a greeting. 

## Build an executable JAR

You can run the application from the command line with Gradle or Maven. 
Or you can build a single executable JAR file that contains all the necessary dependencies, classes, and resources, and run that. 

With Gradle, you can run the application using ./gradlew bootRun. 
Or you can build the runable JAR file using ./gradlew build. 
Then you can run the JAR file:

```
java -jar build/libs/gs-rest-service-0.1.0.jar
```

You can also opt to [build a classic WAR file instead](https://spring.io/guides/gs/convert-jar-to-war/).

## Test the service

Now that the service is up, visit http://localhost:8080/greeting, where you see:

```javascript
{"id":1,"content":"Hello, World!"}
```

Provide a name query string parameter with http://localhost:8080/greeting?name=User. 
Notice how the value of the content attribute changes from "Hello, World!" to "Hello User!":

```javascrip
{"id":2,"content":"Hello, User!"}
```
