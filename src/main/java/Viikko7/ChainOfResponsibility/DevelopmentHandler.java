package Viikko7.ChainOfResponsibility;

public class DevelopmentHandler extends Feedback {
    @Override
        public void handle(Message message){
            if (message.getMessageType() == MessageType.DEVELOPMENT_SUGGESTION) {
                System.out.println("Handling development suggestion from " + message.getEmail());
                System.out.println("Suggestion details: " + message.getContent());
                System.out.println("Logging and prioritizing development suggestion.\n");
            } else if (nextFeedback != null) {
                System.out.println("DevelopmentHandler passed the message to the next handler.\n");
                nextFeedback.handle(message);
            }
        }
    }
