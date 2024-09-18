package Viikko4.State;

public class ExpertState extends State {

    public ExpertState(Character character) {
        super(character);
    }
    public void action() {
        String[] options = {"Train", "Meditate", "Fight"};
        if (this.getCharacter().getExperience() > 1000) {
            this.getCharacter().setState(new MasterState(this.getCharacter()));
        } else {
            switch (this.getCharacter().readUserChoice(options)) {
                case 1:
                    System.out.println("Intermediate " + character.getName() + " is trainin!");
                    character.setExperience(character.getExperience() + 80);
                    System.out.println("Experience: " + character.getExperience());
                    break;
                case 2:
                    System.out.println("Intermediate " + character.getName() + " is meditating...... -_- ...... -_-");
                    character.setHitPoints(character.getHitPoints() +30);
                    System.out.println("Your HP has increased to: " + character.getHitPoints());
                    break;
                case 3:
                    System.out.println("Intermediate " + character.getName() + " STARTED A BATTLE WITH AN ENEMY!");
                    character.setExperience(character.getExperience() + 120);
                    character.setHitPoints(character.getHitPoints() - 20);
                    System.out.println("Experience has increased to: " + character.getExperience());
                    System.out.println("But unfortunately you lost some health. Your current HP:" + character.getHitPoints());
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

}
