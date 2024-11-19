package Viikko12.Bridge;

public class GestureControlRemote extends BasicRemote {

    public GestureControlRemote(Device device) {
        super.device = device;
    }

    public void performGesture(String gesture) {
        System.out.println("Performing gesture: " + gesture);

        switch (gesture.toLowerCase()) {
            case "swipe up":
                device.setVolume(device.getVolume() + 10);
                break;

            case "swipe down":
                device.setVolume(device.getVolume() - 10);
                break;

            case "circle":
                if (device instanceof GamingConsole) {
                    ((GamingConsole) device).launchGame();
                } else {
                    System.out.println("Circle gesture not supported for this device.");
                }
                break;

            case "double tap":
                device.setChannel(device.getChannel() + 1);
                System.out.println("Next game selected.");
                break;

            default:
                System.out.println("Gesture not recognized.");
        }
    }
}
