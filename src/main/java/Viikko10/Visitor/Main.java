package Viikko10.Visitor;

public class Main {
    public static void main(String[] args) {
        // Create files
        File file1 = new File("proxybodygueard.txt", 5);
        File file2 = new File("visitorTeht.jpg", 15);
        File file3 = new File("youtube.mp4", 150);

        // Create directories and add elements
        Directory root = new Directory("root");
        Directory docs = new Directory("documents");
        root.addElement(file1);
        root.addElement(docs);
        docs.addElement(file2);
        root.addElement(file3);

        // Use SizeCalculatorVisitor to calculate total size
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total size: " + sizeVisitor.getTotalSize() + " MB");

        // Use SearchVisitor to find files with ".jpg" extension
        SearchVisitor searchVisitor = new SearchVisitor(".*\\.jpg$");
        root.accept(searchVisitor);
        System.out.println("Matching files:");
        for (File file : searchVisitor.getMatchingFiles()) {
            System.out.println(file.getName());
        }
    }
}
