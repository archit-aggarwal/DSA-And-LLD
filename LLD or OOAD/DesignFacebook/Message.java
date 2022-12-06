public class Message {
    public static int totalMessages = 0;
    private final int messageId;
    private User from, to;
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public User getTo() {
        return to;
    }

    public void setTo(User to) {
        this.to = to;
    }

    public int getMessageId() {
        return messageId;
    }

    public Message() {
        totalMessages++;
        messageId = totalMessages;
    }
}
