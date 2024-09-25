package Viikko5;

import java.util.Random;

public class RussianRoulette extends Game {

    private int numberOfPlayers;
    private boolean[] playersAlive;
    private int bulletPosition;
    private int alivePlayersCount; // Keep track of the number of players still alive
    private boolean gameEnded = false;
    private int winner;

    @Override
    public void initializeGame(int numberOfPlayers) {
        System.out.println("Welcome to the Russian Roulette game! Being ***** is guaranteed once you start this game :) ");

        this.numberOfPlayers = numberOfPlayers;
        playersAlive = new boolean[numberOfPlayers];
        alivePlayersCount = numberOfPlayers;

        for (int i = 0; i < numberOfPlayers; i++) {
            playersAlive[i] = true; // Laittaa kaikki pelaajat eläviksi alussa.
        }

        bulletPosition = new Random().nextInt(6);
        System.out.println("The game is initialized with " + numberOfPlayers + " players.");
    }

    @Override
    public boolean endOfGame() {
        return gameEnded;
    }

    @Override
    public void playSingleTurn(int player) {
        if (!playersAlive[player]) {
            System.out.println("Player " + (player + 1) + " is already out. Skipping their turn.\n");
            return;
        }

        System.out.println("Player " + (player + 1) + "'s turn.");

        int triggerPosition = new Random().nextInt(6);

        if (triggerPosition == bulletPosition) {
            System.out.println("Player " + (player + 1) + " pulled the trigger and the bullet fired! HEEESSSS GOOOOOONEE!! You might be next! \n");
            playersAlive[player] = false;
            alivePlayersCount--;

            if (alivePlayersCount == 1) {
                gameEnded = true;
            }
        } else {
            System.out.println("Player " + (player + 1) + " pulled the trigger and survived. That was a close one!\n");
        }
    }

    @Override
    public void displayWinner() {
        for (int i = 0; i < numberOfPlayers; i++) {
            if (playersAlive[i]) {
                winner = i;
                break;
            }
        }

        if (winner >= 0) {
            System.out.println("Player " + (winner + 1) + " is the last player standing and is the winner!");
            System.out.println("Congratulations! You are the luckiest person alive!");
            System.out.println("But that might not be the case next time you play this game!");
        }
    }


}
