package Viikko10.Proxy;

import java.nio.file.AccessDeniedException;

public class DocumentProxy implements Document {
    private final RealDocument realDocument;

    public DocumentProxy(RealDocument document) {
        this.realDocument = document;
    }

    public String getIdentifier() {
        return realDocument.getIdentifier();
    }

    public String getCreationDate() {
        return realDocument.getCreationDate();
    }

    public String getContent(User user) throws AccessDeniedException {
        if (AccessControlService.getInstance().isAllowed(realDocument.getIdentifier(), user.getUsername())) {
            return realDocument.getContent(user);
        } else {
            throw new AccessDeniedException("Access Denied to document: " + realDocument.getIdentifier());
        }
    }
}
