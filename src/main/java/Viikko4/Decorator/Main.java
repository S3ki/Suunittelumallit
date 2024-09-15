package Viikko4.Decorator;

import java.util.Base64;

public class Main {

    public static void main(String[] args) {

        Printer printer = new BasicPrinter();
        printer.print("Hello World!");

        Printer printer2 = new EncryptedPrinterDecorator(new FilePrinterDecorator(new BasicPrinter()));
        printer2.print("Hello World!");


    }
}