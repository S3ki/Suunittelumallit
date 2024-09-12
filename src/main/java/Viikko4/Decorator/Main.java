package Viikko4.Decorator;

import java.util.Base64;

public class Main {

    public static void main(String[] args) {

        Printer printer = new BasicPrinter();
        printer.print("Hello world");

        Printer decorator = new PrinterDecorator(new BasicPrinter());
        decorator.print("I do nothing, i just use the basic printer");

        Printer fileDecorator = new FilePrinterDecorator(new BasicPrinter());
        fileDecorator.print("Filewriter things");

        Printer encryptedDecorator = new EncryptedPrinterDecorator(new FilePrinterDecorator(new BasicPrinter()));
        encryptedDecorator.print("Hi there i am encrypted");

    }
}