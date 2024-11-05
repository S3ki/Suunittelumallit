package Viikko10.Proxy;

import java.util.Date;

public class RealDocument implements Document {
    private final String identifier;
    private final String creationDate;
    private final String content;

    public RealDocument(String identifier, String creationDate, String content) {
        this.identifier = identifier;
        this.creationDate = creationDate;
        this.content = content;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getContent(User user) {
        return content;
    }

}
