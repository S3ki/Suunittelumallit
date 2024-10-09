package Viikko7.ChainOfResponsibility;

public class main {
    public static void main(String[] args) {
        // Create message instances for different feedback types
        Message compensationClaim = new Message(MessageType.COMPENSATION_CLAIM,
                "I want compensation for a late order very dissapointed.", "Tero@Yle.com");

        Message contactRequest = new Message(MessageType.CONTACT_REQUEST,
                "Please contact me regarding my order i have no confirmation or receipt.", "Kaisa@logi.com");

        Message developmentSuggestion = new Message(MessageType.DEVELOPMENT_SUGGESTION,
                "It would be great to have more payment options.", "Murtala@yahoo.com");

        Message generalFeedback = new Message(MessageType.GENERAL_FEEDBACK,
                "Great service, but shipping was a bit slow.", "Make@tetteri.com");

        Feedback compensationHandler = new CompensationHandler();
        Feedback contactHandler = new ContactHandler();
        Feedback developmentHandler = new DevelopmentHandler();
        Feedback generalHandler = new GeneralHandler();

        compensationHandler.setNextFeedback(contactHandler);
        contactHandler.setNextFeedback(developmentHandler);
        developmentHandler.setNextFeedback(generalHandler);

        compensationHandler.handle(generalFeedback);


    }
}
