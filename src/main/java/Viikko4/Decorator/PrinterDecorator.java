package Viikko4.Decorator;

public class PrinterDecorator implements Printer {

    Printer printer;
    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
