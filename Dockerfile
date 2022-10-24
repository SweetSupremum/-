FROM openjdk:11
WORKDIR ./src/main/java/politeh/works/work_first/
COPY src/main/java/politeh/works/work_first ./src/main/java/politeh/works/work_first
RUN javac -d out src/main/java/politeh/works/work_first/HelloWorld.java
RUN jar -cvfe hello.jar politeh.works.work_first.HelloWorld -C out .
CMD ["java","-jar", "hello.jar"]