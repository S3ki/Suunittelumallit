package Viikko4.State;

public class MasterState extends State {

    public MasterState(Character character) {
        super(character);
    }
    @Override
    public void action() {
        System.out.println(character.getName() + " is a master now, you can't do anything else!\n");
        System.out.println("Master " + character.getName() + " has reached the end of the game, CONGRATS!!");
        character.setStateBoolean(false);
    }
}
