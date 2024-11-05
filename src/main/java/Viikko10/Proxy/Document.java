package Viikko10.Proxy;

import java.nio.file.AccessDeniedException;

public interface Document {

    String getIdentifier();

    String getCreationDate();

    String getContent(User user) throws AccessDeniedException;
}
