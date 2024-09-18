package Viikko4.State;

public abstract class State {
    Character character;

    public State(Character character) {
        this.character = character;
    }

    public Character getCharacter() {
        return character;
    }
    public abstract void action();
}
