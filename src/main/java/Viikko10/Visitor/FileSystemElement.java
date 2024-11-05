package Viikko10.Visitor;

public interface FileSystemElement {
    void accept(FileSystemVisitor visitor);
}
