package AdapterClasses;

public class SocialMediaClient {
    public static void main(String[] args) {
        // Creating adaptee instances
        FacebookPost facebookPost = new FacebookPost();
        TwitterPost twitterPost = new TwitterPost();

        // Creating adapter instances
        SocialMediaPost facebookAdapter = new FacebookPostAdapter(facebookPost);
        SocialMediaPost twitterAdapter = new TwitterPostAdapter(twitterPost);

        // Posting updates using the adapters
        facebookAdapter.postUpdate("Hello, Facebook!");
        twitterAdapter.postUpdate("Hello, Twitter!");
    }
}

