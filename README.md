# Social media kata

EXERCISE: "Implement the core domain logic for a social networking application 
(similar to Twitter)." Allotted time for initial work: two hours.

## Building the project

This is a Java 8 project using JUnit 5 for testing. I thought about using 
PostGreSQL but didn't get around to making a decision on that.

Once Git cloned, open the project using IntelliJ IDEA. Source and test content 
roots should already be marked as such. There might be a slight discrepancy in 
the minor version of JUnit 5, so pull up `test/socialmedia.UserTest` and direct 
IntelliJ to hook up whatever minor version of JUnit 5 you might have on your 
machine. Then run `testToString()`. The project should then build.

Note: as a tiny gesture towards inclusivity, the principal branch of this 
project is called main. I hope this doesn't cause any inconveniences with any 
toolchain.

## Overview of the project

The idea was that I would implement the social media network with the MVC and 
REST paradigms. Too late into the allotted time I realized I should focus on 
getting the mock database, `socialmedia.db.MockDatabase`, as polished as I 
could, but I only got around to making it sure it can add and retrieve users. 
