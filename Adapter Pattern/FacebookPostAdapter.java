package AdapterClasses;

class FacebookPostAdapter implements SocialMediaPost {
    private FacebookPost facebookPost;

    public FacebookPostAdapter(FacebookPost facebookPost) {
        this.facebookPost = facebookPost;
    }

    @Override
    public void postUpdate(String message) {
        facebookPost.postToFacebook(message);
    }
}
