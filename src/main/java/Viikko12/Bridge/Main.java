package Viikko12.Bridge;

public class Main {
    public static void main(String[] args) {
        testDevice(new GamingConsole());
    }

    public static void testDevice(Device device) {
        GestureControlRemote gestureRemote = new GestureControlRemote(device);

        gestureRemote.power(); // Turn the device on
        device.printStatus();

        gestureRemote.performGesture("swipe up");
        gestureRemote.performGesture("double tap");
        gestureRemote.performGesture("circle");

        if (device instanceof GamingConsole) {
            ((GamingConsole) device).adjustSettings();
        }

        device.printStatus();
    }
}

