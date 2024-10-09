package Viikko7.ChainOfResponsibility;

public class GeneralHandler extends Feedback{
    @Override
    public void handle(Message message) {
        if (message.getMessageType() == MessageType.GENERAL_FEEDBACK) {
            System.out.println("Handling general feedback from " + message.getEmail());
            System.out.println("Feedback details: " + message.getContent());
            System.out.println("Thank you for sending this feedback we will use this to improve our services further.\n");
        } else if (nextFeedback != null) {
            System.out.println("GeneralHandler passed the message to the next handler. \n");
            nextFeedback.handle(message);
        }
    }
}
