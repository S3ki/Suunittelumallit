package Viikko4.State;

public class IntermediateState extends State {

    public IntermediateState(Character character) {
        super(character);
    }

    @Override
    public void action() {
        String[] options = {"Train ","Meditate"};
        if (this.getCharacter().getExperience() > 500) {
            this.getCharacter().setState(new ExpertState(this.getCharacter()));
        } else {
            switch (this.getCharacter().readUserChoice(options)) {
                case 1:
                    System.out.println("Intermediate " + character.getName() + " is trainin!");
                    character.setExperience(character.getExperience() + 50);
                    System.out.println("Experience: " + character.getExperience());
                    break;
                case 2:
                    System.out.println("Intermediate " + character.getName() + " is meditating...... -_- ...... -_-");
                    character.setHitPoints(character.getHitPoints() + 10);
                    System.out.println("Your HP has increased to: " + character.getHitPoints());
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
