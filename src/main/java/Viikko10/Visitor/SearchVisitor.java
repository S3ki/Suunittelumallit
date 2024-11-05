package Viikko10.Visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class SearchVisitor implements FileSystemVisitor {
    private Pattern pattern;
    private List<File> matchingFiles = new ArrayList<>();

    public SearchVisitor(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    public List<File> getMatchingFiles() {
        return matchingFiles;
    }

    @Override
    public void visit(File file) {
        if (pattern.matcher(file.getName()).find()) {
            matchingFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        // No additional action required for directories in search
    }
}
