# microservice
Simple microservice application with Eureka naming server, zuul gateway and spring boot rest client.

1. Start eureka server on port 8761 that is default port for it. It will start to server ui on http://localhost:8761/
2. Start zuul server, and check that your zuul application is registered successfully to eureka on http://localhost:8761/
3. Start student application and check it is registered to eureka server on http://localhost:8761/

## How It Works
- On eureka naming server you'll find your registered applications
- On zuul application.yml file you will find the applications that is redirected from zuul to your actual application

For given configuration, Eureka runs on 8761 and Zuul run on 8765.
localhost:8765/api is your base path for every service that is registered to zuul, then you can find your actual service responses
on required paths of your services.
In this example --> localhost:8765/api/student/get-all will call zuul server directly and zuul will redirect api call to 
student service with get-all path and send back response to caller.

If have any problem please send me an email directly.

## aliaslanatasoy@gmail.com
