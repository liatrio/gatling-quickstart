# Gatling Demo


Demo of Gatling using a Maven project. This project run a test scenario against Liatrio's internal demo site (currently set to dev.timshort.liatr.io) After running the Maven build, Gatling will generate HTML and log reports in the `/target` folder.

Requirements
- JDK 1.8
- Maven

Run the Maven build

    mvn clean gatling:test


To specify the class, add the build parameter

    $mvn clean gatling:test -Dgatling.simulationClass=performancetests.SubmitForm


