package Viikko7.ChainOfResponsibility;

public class Message {

    public Message(MessageType type, String content, String email) {
        this.type = type;
        this.content = content;
        this.email = email;
    }
    private MessageType type;
    private String content;
    private String email;

    public MessageType getMessageType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public String getEmail() {
        return email;
    }


}
