# onsitebatch1_hasan
java, cucumber BDD, Gharkin, CI/CD, github, maven, git etc
# Tools Required
-Github Account
-Install Git
-java 17 or up
-cucumber and selenium(add that inside the dependences)
-install maven
-IDE(intellj install for free)
# List of Denpendences:https://mvnrepository.com/
-seleniun-java
-Cucumber-Testng
Cucumber-java
# Reporting
-jvm report
-in pom .xtml we added block call build
-

# Plugin from Intellj
-Cumcumber for java
-Gharkin

# How to run the test in CLI
mvn verify (it will run all test with the default browser and env)
mvn verify -Dbrowser=chrome -Denv=qa (it will run in Chrome browser in QA Env stage.taltektc.com)
mvn verify -Dbrowser=chrome -Denv=qa -Dcucumber.filter.tags=Test1


