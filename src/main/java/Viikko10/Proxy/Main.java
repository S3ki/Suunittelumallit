package Viikko10.Proxy;

import java.nio.file.AccessDeniedException;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding documents to the library
        library.addUnprotectedDocument("doc1", "2024-11-04", "Unprotected Document Content");
        library.addProtectedDocument("doc2", "2024-11-04", "Protected Document Content", "Alice");

        // Creating users
        User alice = new User("Alice");
        User bob = new User("Bob");

        // Accessing documents
        try {
            Document doc1 = library.getDocument("doc1");
            System.out.println("Doc1 Content: " + doc1.getContent(bob)); // No access control needed

            Document doc2 = library.getDocument("doc2");
            System.out.println("Doc2 Content for Alice: " + doc2.getContent(alice)); // Access granted
            System.out.println("Doc2 Content for Bob: " + doc2.getContent(bob)); // Should throw AccessDeniedException
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}
