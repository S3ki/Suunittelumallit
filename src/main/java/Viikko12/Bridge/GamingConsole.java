package Viikko12.Bridge;

public class GamingConsole implements Device {
    private boolean on = false;
    private int volume = 50;
    private int currentGameId = 0;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("Gaming Console is now ON.");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("Gaming Console is now OFF.");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = Math.min(Math.max(volume, 0), 100);
        System.out.println("Gaming Console volume set to " + this.volume + "%.");
    }

    @Override
    public int getChannel() {
        return currentGameId;
    }

    @Override
    public void setChannel(int gameId) {
        this.currentGameId = gameId;
        System.out.println("Game ID " + this.currentGameId + " is now selected.");
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm a Gaming Console.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%.");
        System.out.println("| Currently playing Game ID " + currentGameId);
        System.out.println("------------------------------------\n");
    }

    public void launchGame() {
        if (on) {
            System.out.println("Launching Game ID " + currentGameId + "...");
        } else {
            System.out.println("Gaming Console is OFF. Cannot launch game.");
        }
    }

    public void adjustSettings() {
        if (on) {
            System.out.println("Opening Gaming Console settings...");
        } else {
            System.out.println("Gaming Console is OFF. Cannot adjust settings.");
        }
    }
}