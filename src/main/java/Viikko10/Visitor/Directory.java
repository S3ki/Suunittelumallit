package Viikko10.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement {
    private String name;
    private List<FileSystemElement> fileSystemElements = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addElement(FileSystemElement fileElement) {
        fileSystemElements.add(fileElement);
    }

    public List<FileSystemElement> getFileSystemElements() {
        return fileSystemElements;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
        for (FileSystemElement element : fileSystemElements) {
            element.accept(visitor);
        }
    }
}

