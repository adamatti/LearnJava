![Travis Build status](https://travis-ci.org/adamatti/LearnJava.svg?branch=master)

Sample project for programers that are learning java

#### Run with Maven

* `mvn compile`
	* ... to compile the code
* `mvn test`
	* ... to run unit tests
* `mvn exec:java -Dexec.mainClass="adamatti.Main"`
	* ... to run the code

#### Run with Gradle

* `gradle idea`
	* ... to generate Intellij descriptors
* `gradle assemble`
	* ... to package the app
* `gradle run`
	* ... to run the project
* `gradle jacocoTestReport`
	* ... to run the tests and generate coverage
* `gradle --gui`
	* ... to show all tasks in a GUI