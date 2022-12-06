public class Post {
    private static int totalPosts = 0;
    private final int postId;
    private User creator;
    private String text;

    public int getPostId() {
        return postId;
    }

    public Post() {
        totalPosts++;
        postId = totalPosts;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
