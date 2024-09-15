package Viikko4.Decorator;

import java.io.FileWriter;
import java.io.IOException;

public class FilePrinterDecorator extends PrinterDecorator implements Printer{
    String base = "writer.txt";
    FileWriter fw;

    public FilePrinterDecorator(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String text) {
        System.out.println("Filewrote: " + text);
        printer.print(text);
        try {
            fw = new FileWriter(base);
            fw.write(text);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}