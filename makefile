# 
# makefile
# 
# input file for 'make' build tool ( /usr/bin/make )
# to build https://github.com/JaysGitLab/cs-5666-greeting-bclinthall/projects/1
# following Dr. Fenwick's solution for CS 5666 JUnit sample
#
# #
# # @author B. Clint Hall
# # @author Dr Fenwick
# # @version Spring 2017
# #
#

JUNIT_JAR = /usr/share/java/junit-4.10.jar
HAMCREST_JAR = /usr/share/java/hamcrest/core-1.1.jar

default:
	@echo "usage: make target"
	@echo "available targets: compile, test, clean"

compile: Greeter.java GreeterTest.java
	javac -cp .:$(JUNIT_JAR) GreeterTest.java
	javac Greeter.java

clean:
	rm -f Greeter.class
	rm -f GreeterTest.class

test:  Greeter.java GreeterTest.java
	java -cp .:$(JUNIT_JAR):$(HAMCREST_JAR) org.junit.runner.JUnitCore GreeterTest




