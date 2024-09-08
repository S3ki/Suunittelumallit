package Viikko3v2.Model;

public class Display implements Observer {
    private String displayType;

    public Display(String displayType) {
        this.displayType = displayType;
    }

    @Override
    public void update(int temperature) {
        switch (displayType) {
            case "simple":
                System.out.println("Simple Display: Current temperature is " + temperature + "°C\n");
                break;
            case "detailed":
                System.out.println("Detailed Display: The temperature is now " + temperature + "°C. For more info turn on the weather channel!\n");
                break;
            case "alert":
                System.out.println("Alert Display: Temperature Alert! It's " + temperature + "°C. Be cautious!\n");
                break;
            default:
                System.out.println("Unknown Display: Temperature is " + temperature + "°C\n");
        }
    }
}