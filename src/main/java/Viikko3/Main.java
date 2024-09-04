package Viikko3;

public class Main {
    public static void main(String[] args) {
        UIFactory factory = new AFactory(); // tai uusi BFactory();

        Button button = factory.createButton("OK");
        TextField textField = factory.createTextField("Kirjoita tähän");
        Checkbox checkbox = factory.createCheckbox("Muista minut");

        button.display();
        textField.display();
        checkbox.display();

        button.setText("Paina tästä");
        textField.setText("syötä tähän jotain");
        checkbox.setText("tarkista teksti");

        button.display();
        textField.display();
        checkbox.display();
    }
}
