package Viikko4.State;

public class Character {
    String name;
    String title;
    int level;
    int experience;
    int hitPoints;

    public Character(String name, String title,int level, int experience, int hitPoints) {
        this.name = name;
        this.title = title;
        this.level = level;
        this.experience = experience;
        this.hitPoints = hitPoints;
    }
    public String getName() {
        return name;
    }
    public String getTitle() {
        return title;
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
    

}
