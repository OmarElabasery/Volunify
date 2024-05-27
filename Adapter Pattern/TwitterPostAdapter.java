package AdapterClasses;

class TwitterPostAdapter implements SocialMediaPost {
    private TwitterPost twitterPost;

    public TwitterPostAdapter(TwitterPost twitterPost) {
        this.twitterPost = twitterPost;
    }

    @Override
    public void postUpdate(String message) {
        twitterPost.postToTwitter(message);
    }
}
