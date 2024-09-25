package Viikko4.State;

public class NoviceState extends State {
    public NoviceState(Character character) {
        super(character);
    }

    @Override
    public void action() {
        String[] options = {"Train"};
        if (this.getCharacter().getExperience() > 80) {
            System.out.println("Novice " + character.getName() + " has reached the intermediate level!");
            this.getCharacter().setState(new IntermediateState(this.getCharacter()));
        } else {
            switch (this.getCharacter().readUserChoice(options)) {
                case 1:
                    System.out.println("Novice " + character.getName() + " is trainin!");
                    character.setExperience(character.getExperience() + 10);
                    System.out.println("Experience: " + character.getExperience());
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }




    }

}
