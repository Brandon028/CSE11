
class User {

    String username;
    String fullname;
    int followers;

    User(String username, String fullname, int followers){
        
        this.username = username;
        this.fullname = fullname;
        this.followers = followers;
    }

    String toText (){
        return this.fullname + " @" + this.username;
    }

    
}

class Tweet{
    String content;
    User user;
    int likes;
    String tweetId;

    Tweet (String content, User user, int likes, String tweetId){
        this.content = content;
        this.user = user;
        this.likes = likes;
        this.tweetId = tweetId;
    }

    boolean longerThan (Tweet passedIn){
        if (this.content.length() > passedIn.content.length()) {
            return true;
        }
        else {
            return false;
        }
    }

    boolean moreLikes (Tweet passedIn){
        if (this.likes > passedIn.likes){
            return true;
        }
        else {
            return false;
        }
    }

    Tweet reTweet (User passedIn){
        Tweet rt = new Tweet (this.content, passedIn, 0, this.tweetId + "-rt");
        return rt;
    }

    String toText(){
        return this.user.toText() + " : " + this.content + " : " + this.likes + " Likes";
    
    }

    String toLink(){
        return "https://twitter.com/" + this.user.username + "/status/" + this.tweetId;
    }
    
}

class ExampleTweets{
    User UCSDJacobs = new User ("UCSDJacobs", "UCSD Engineering", 11900);
    User java = new User ("java", "Java", 482300);
    User NBA = new User ("NBA", "NBA", 32900000);
    
    //https://twitter.com/UCSDJacobs/status/1376925055234367495
    Tweet tweet1 = new Tweet ("The @UCSanDiegoJacobs School of Engineering has been ranked the #9 engineering school in the country by @usnews. THANK YOU to our students, faculty, staff & partners. Your work to leverage engineering for the public good is reflected in this recognition: http://bit.ly/2021Rankings", UCSDJacobs, 59, "1376925055234367495");

    //https://twitter.com/UCSDJacobs/status/1380582783521861635
    Tweet tweet2 = new Tweet ("Happening now! Get your questions answered, see what @UCSanDiegocampus is like on a virtual tour, hear from our students, faculty and staff, and come join us at the #9 engineering school in the country. #TritonPride Trident emblem https://tritonday.ucsd.edu", UCSDJacobs, 2, "1380898363646836737");

    //https://twitter.com/java/status/1380212394173997057
    Tweet tweet3 = new Tweet ("\"Become involved in why you're building software and not just the act of building it.\" -@jeffiel gives some great advice to #developers", java, 19, "1380212394173997057");

    //https://twitter.com/NBA/status/1381620666768760836
    Tweet tweet4 = new Tweet ("30 @MilesBridges DUNKS in 30 SECONDS!", NBA, 5819, "1381620666768760836");

    String ExampleA1 = UCSDJacobs.toText();
    String ExampleA2 = java.toText();

    boolean ExampleB1 = tweet1.moreLikes(tweet3);
    boolean ExampleB2 = tweet2.moreLikes(tweet4);

    boolean ExampleC1 = tweet4.longerThan(tweet3);
    boolean ExampleC2 = tweet2.longerThan(tweet4);

    Tweet ExampleD1 = tweet3.reTweet(UCSDJacobs);
    Tweet ExampleD2 = tweet4.reTweet(java);

    String ExampleE1 = tweet2.toText();
    String ExampleE2 = tweet3.toText();

    String ExampleF1 = tweet3.toLink();
    String ExampleF2 = tweet4.toLink();
    //run code: .\run.bat ExampleTweets
    
}