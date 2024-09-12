package Viikko4.Decorator;

import java.io.FileWriter;
import java.io.IOException;

public class FilePrinterDecorator extends PrinterDecorator {

    public FilePrinterDecorator(Printer printer) {
        super(printer);
    }

    public void print(String text) {
        String base = "src/main/java/Viikko4/Decorator/writer.txt";
        try {
            FileWriter fw = new FileWriter(base);
            fw.write(text);
            fw.close();
            System.out.println("Filewrote: " + text);
            printer.print(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}