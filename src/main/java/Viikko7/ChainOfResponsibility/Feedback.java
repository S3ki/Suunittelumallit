package Viikko7.ChainOfResponsibility;

public class Feedback {
    Feedback nextFeedback;

    public void handle(Message message) {
        if (nextFeedback != null) {
            nextFeedback.handle(message);
        }
    }
    public void setNextFeedback(Feedback nextFeedback) {
        this.nextFeedback = nextFeedback;
    }

}
