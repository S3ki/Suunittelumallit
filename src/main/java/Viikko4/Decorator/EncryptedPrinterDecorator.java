package Viikko4.Decorator;

import java.util.Base64;


public class EncryptedPrinterDecorator extends PrinterDecorator {
    Base64.Encoder enc = Base64.getEncoder();
    Base64.Decoder dec = Base64.getDecoder();

    public EncryptedPrinterDecorator(Printer printer) {
        super(printer);
    }

    public void print(String text) {
        String encoded = enc.encodeToString(text.getBytes());
        System.out.println("encrypted value is: " + encoded);

        String decoded = new String(dec.decode(encoded));
        System.out.println("decrypted value is: " + decoded);
        super.print(text);

    }

}
