# CSE-11 Programming Assignment 2
### Due Date: Wednesday, April 14, 11:59PM Pacific Time
## Learning Goals
- Write and use classes to represent real world data, and relations between them
- Write methods that make decisions

## Collaboration
Different assignments in this course have different collaboration policies. On this assignment, you can collaborate with anyone in the course, including sharing code. In your submission, give credit to all students and course staff who helped you with this assignment by noting their name and how you used their ideas or work. Note that using someone's work without giving credit to them is a violation of academic integrity.

## Process
- You can download the starter code for this assignment from the repository.
- You will write all your code and comments in ExampleTweets.java.

## Submission
- You will submit a single file called ExampleTweets.java to Gradescope for the PA2 assignment. This file will contain all three classes that you write, including Tweet, User, and ExamplesTweets (the class).
- There will not be an autograded part for this assignment. You will see your score with feedback a couple of days after the due date.

## Resubmission/Late Policy
- We will not accept this PA late.
- If you did not submit this PA or did poorly (<75%), you can fix your PA and resubmit it to the PA resubsmission assignment in Gradescope to earn a maximum of 75% the points.
- If you scored higher than 75% on the origianl PA, we may grade the resubmission, but will not change your original grade.
- The resubmission will be open for 2 weeks after the PA's original due date.

## Problem : Displaying Tweets

In this programming assignment, you will be using tweets as data and representing them using objects. You will be making three classes (two classes for implementation and one example class for testing your implementation). 
Note: You will create 3 classes in one file, and a dozen or more objects. Keep in mind that a class is the shape of an object: A class defines what fields the object has, but does not specify the value of each of the fields. When an object is created by using a class’s constructor, values are provided for all the fields, and those values are specific to the object being created.

### Implementation:

#### Class 1: User
- The class User will be defining users, or the authors of the tweet
- Required fields - Each object of class User must have a :
    1. `username (String)` 	- username of account which posted the tweet
    2. `fullname (String)`	- Full name of author 
    3. `followers (int)` 	- Number of followers 
- Required methods - 
    1. `toText`
        - This method will return a string which contains the username and fullname of the user.
        - Parameters - None
        - Return type - String
        - The username must be prefixed with a “@” character.
        - Example of string returned: “UC San Diego @UCSanDiego”
- Note: To get information about the user (when creating user objects) you will have to go to their profile and see how many followers they have and then instantiate a new object with that value.
- Here’s an example to demonstrate the fields of the User class:
<img src="img/img1.png" width="500">

#### Class 2: Tweet
- The class Tweet will be defining a tweet
- Required fields - Each object of class Tweet must have a : 
    1. `content (String)`	- the content of a tweet
    2. `user (User)`		- a reference to a User object of the author of the tweet
    3. `likes (int)`		- the number of likes that the tweet has
    4. `tweetID (String)`	- the ID of the tweet

- Required methods -
    1. `longerThan`
        - This method compares two Tweet objects (this, and the one passed as a parameter) and returns true if the content is longer than that of the object passed
        - Parameters - reference to a Tweet object to compare against
        - Return type - boolean 
    2. `moreLikes`
        - This method compares two Tweet objects (this, and the one passed as a parameter) and returns true if the number of likes is more than that of the object passed
        - Parameters -  reference to a Tweet object to compare against
        - Return type - boolean
    3. `retweet`
        - This method makes a new Tweet object with a reference to a different User object, and with likes set to zero. Since we are creating a new Tweet object, we will also have a new tweetID. You should append “-rt” to the copy of the tweetID of the original Tweet object every time you retweet. The method returns the new tweet object.
        - Parameters -  reference to a User object
        - Return type - Tweet
        - For example, let’s say we have a Tweet called t with originalTweetID:
            - For the retweet to t, we create a new Tweet object called rt, whose tweetID should be originalTweetID-rt
            - For the retweet to rt, we create a new Tweet object rtrt, whose tweetID should be originalTweetID-rt-rt
            - It is OK for retweets to have the same IDs when there are multiple retweets for the same Tweet object.
    4. `toText`
        - This method returns a String that represents the Tweet object with all the User information (for this you will have to call toText methods of another object) and also displays the tweet content and likes.
        - Parameters - None
        - Return type - String
        - These details will be separated by a “:”
        - Example of string returned - “Julia Evans @b0rk : when debugging, your attitude matters : 468 Likes” 
    5. `toLink`
        - This method returns a string representing the URL for the Tweet object
        - Parameters - None 
        - Return type - String
        - Sample format for toLink(): https://twitter.com/username/status/tweetID
- Here’s an example to demonstrate the fields of the Tweet class:
<img src="img/img2..png" width="500">

### Testing:
#### Class 3: Example Tweets
- The ExampleTweets class is for testing your own implementation
- In order to test your classes and methods, find four real tweets from twitter.com with the following properties:
    - Two of them are from the same user
    - The other two are from two different users
- You may find these accounts useful and relevant for finding fun Tweets:
    - https://twitter.com/UCSDJacobs
    - https://twitter.com/java
    - https://twitter.com/b0rk
(If you can’t go to Twitter for some reason, let us know via Piazza or email and we’ll help you out – you may be able to complete the assignment with another social media example).
- In your test class ExampleTweets, you will construct User objects and Tweet objects corresponding to these four tweets you found.
- In your test file ExamplesTweets.java, you will call each method you write at least twice using the objects you constructed to build these examples. Since there are 6 methods, you should have at least 12 method calls total to test your work, and every method should be called at least twice.
- For each tweet you found, write a comment before the line where you construct it with:
    - A link to the Tweet
    - An answer to this question: "Were there any parts of the Tweet that you couldn’t represent with the class design we chose?"
