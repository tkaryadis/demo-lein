# demo-lein

Example of using leiningen with spring-boot webflux

Working, netty starts on 8080
```
lein run   
```

Doens't work, standalone jar is made but netty doesn't start
```
lein uberjar 
cd target
java -jar demo-lein-0.1.0-SNAPSHOT-standalone.jar 
```
