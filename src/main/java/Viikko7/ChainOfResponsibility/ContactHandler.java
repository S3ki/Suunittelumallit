package Viikko7.ChainOfResponsibility;

public class ContactHandler extends Feedback {
    @Override
    public void handle(Message message) {
        if (message.getMessageType() == MessageType.CONTACT_REQUEST) {
            System.out.println("Handling contact request from " + message.getEmail());
            System.out.println("Request details: " + message.getContent());
            System.out.println("Forwarding contact request to the appropriate department.\n");
        } else if (nextFeedback != null) {
            System.out.println("ContactHandler passed the message to the next handler.\n");
            nextFeedback.handle(message);
        }
    }
}
