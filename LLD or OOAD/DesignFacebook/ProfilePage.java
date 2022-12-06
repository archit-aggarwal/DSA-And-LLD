import java.util.*;

public class ProfilePage {
    private String workExperience;
    private String education;
    private HashMap<Integer, User> friendList;
    private List<Message> messageList;
    private List<Post> posts;

    public ProfilePage() {
        friendList = new HashMap<>();
        messageList = new ArrayList<>();
        posts = new ArrayList<>();
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public void addFriend(User friend) {
        friendList.put(friend.getUserId(), friend);
    }

    public void removeFriend(Integer frienduserId) {
        friendList.remove(frienduserId);
    }

    public void addMessage(Message message) {
        messageList.add(message);
    }

    public void addPost(Post post) {
        posts.add(post);
    }
}
