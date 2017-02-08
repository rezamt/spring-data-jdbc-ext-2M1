### Spring Rest & Spring Boot

### Spring Data JDBC Extensions 
Spring Data JDBC Extensions is part of the umbrella Spring Data project. The JDBC support in the Spring Framework is extensive and covers the most commonly used features. This extension project provides additional support for working with advanced Oracle database features and also with new usage scenarios like type-safe queries using Querydsl.


### Spring Databook Project
- [Spring Data JDBC Extensions](http://projects.spring.io/spring-data-jdbc-ext/)
- [spring-data-book samples](https://github.com/spring-projects/spring-data-book)
- [Oracle Docker Image Repo](https://github.com/oracle/docker-images/tree/master/OracleDatabase)
- [Building Oracle Docker Image](https://blogs.oracle.com/developer/entry/creating_and_oracle_database_docker)

### Installing Oracle JDBC Driver 

```bash

# Oracle 12g
$ mvn install:install-file -Dfile=/{YOUR-ROOT}/spring-data-jdbc-ext-2M1/drivers/oracle-db-12g/ojdbc7.jar -DgroupId=com.oracle -DartifactId=ojdbc7 -Dversion=12.1.0.1 -Dpackaging=jar


[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-install-plugin:2.4:install-file (default-cli) @ standalone-pom ---
[INFO] Installing /Users/{user-name}/spring-data-jdbc-ext-2M1/drivers/oracle-db-12g/ojdbc7.jar to /Users/{user-name}/.m2/repository/com/oracle/ojdbc7/12.1.0.1/ojdbc7-12.1.0.1.jar
[INFO] Installing /var/folders/qx/r0v5142n79x_88_pbzs8dnk40000gn/T/mvninstall8322717746904588416.pom to /Users/{user-name}/.m2/repository/com/oracle/ojdbc7/12.1.0.1/ojdbc7-12.1.0.1.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.310 s
[INFO] Finished at: 2017-02-09T00:25:00+11:00
[INFO] Final Memory: 8M/245M
[INFO] ------------------------------------------------------------------------
Rezas-MacBook-Pro-2:repo reza$


# Oracle 11g

$ mvn install:install-file -Dfile=/{YOUR-ROOT}/spring-data-jdbc-ext-2M1/drivers/oracle-db-11g/ojdbc6.jar -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0.4 -Dpackaging=jar


```

### References

[Oracle 12g JDBC Driver](http://www.oracle.com/technetwork/apps-tech/jdbc-112010-090769.html)
[Oracle 11g JDBC Driver]()