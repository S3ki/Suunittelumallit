package Viikko7.ChainOfResponsibility;

public class CompensationHandler extends Feedback{
    @Override
    public void handle(Message message) {
        if (message.getMessageType() == MessageType.COMPENSATION_CLAIM) {
            System.out.println("Handling compensation claim from " + message.getEmail());
            System.out.println("Claim details: " + message.getContent());
            System.out.println("Compensation claim has been processed succesfully.\n");
        } else if (nextFeedback != null) {
            System.out.println("CompensationHandler passed the message to the next handler. \n");
            nextFeedback.handle(message);
        }
    }
}
