FROM openjdk:11
WORKDIR .
COPY . .
RUN javac -d out src/main/java/HelloWorld.java
RUN jar -cvfe hello.jar HelloWorld -C out .
CMD ["java","-jar", "hello.jar"]