http://localhost:8585/hello/welcome

Welcome for Spring Boot Hello World

http://localhost:8585/hello/welcome/Muthu

Welcome Muthu for Spring Boot Hello World


Junits were written by TestRestTemplate


Run Spring Boot app with java -jar command :
java -jar -Dserver.port=8581 target/hello-sb-0.0.1-SNAPSHOT.jar com.cmuthumg.hellosb.HelloSbApplication

Run Spring Boot app using Maven :
mvn spring-boot:run

java -jar vs spring-boot:run
-jar will execute only executable jar, whereas spring-boot:run will do mvn clean install and run the executable jar.
