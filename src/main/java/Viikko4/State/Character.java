package Viikko4.State;

import java.util.List;
import java.util.Scanner;

public class Character {
    private static Scanner scanner = new Scanner(System.in);
    String name;
    int level;
    int experience;
    int hitPoints;

    boolean stateBoolean = true;

    private State state;


//    List<String> crew;

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
        this.experience = 0;
        this.hitPoints = 0;
        state = new NoviceState(this);
    }

    public void operate() {
        while (stateBoolean) {
            // just in case just like in the example
            if (state == null) {
                System.out.println("Character was not creater / or for immersion the character died");
                return;
            }
            state.action();
        }
    }
    public int readUserChoice(String[] options) {
        System.out.println("\nSelect an option:");
        for (int i = 1; i <= options.length; i++) {
            System.out.println( i + ". " + options[i-1]);
        }
        return scanner.nextInt();
    }
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public int getExperience() {
        return experience;
    }
    public int getHitPoints() {
        return hitPoints;
    }

    public void setStateBoolean(boolean stateBoolean) {
        this.stateBoolean = stateBoolean;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}
