package Viikko10.Proxy;

import java.util.HashMap;

    public class Library {
        private final HashMap<String, Document> documents = new HashMap<>();

        public void addUnprotectedDocument(String identifier, String creationDate, String content) {
            documents.put(identifier, new RealDocument(identifier, creationDate, content));
        }

        public void addProtectedDocument(String identifier, String creationDate, String content, String allowedUser) {
            RealDocument docu = new RealDocument(identifier, creationDate, content);
            DocumentProxy proxy = new DocumentProxy(docu);
            documents.put(identifier, proxy);
            AccessControlService.getInstance().allowAccess(identifier, allowedUser);
        }

        public Document getDocument(String identifier) {
            return documents.get(identifier);
        }
}
