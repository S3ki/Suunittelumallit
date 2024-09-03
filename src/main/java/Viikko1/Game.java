package Viikko1;

import java.util.Random;

public class Game {

    public Map createMap(String type, int width, int height) {
        if (type.equals("wilderness")) {
            return new WildernessMap(width, height);
        } else if (type.equals("city")) {
            return new CityMap(width, height);
        } else {
            throw new IllegalArgumentException("We do not support this Map type: " + type);
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        Random rand = new Random();
        int width = rand.nextInt(10);
        int height = rand.nextInt(10);

        Map cityMap = game.createMap("city", width, height);
        System.out.println("City Map:\n");
        cityMap.display();

        Map wildernessMap = game.createMap("wilderness", 5, 5);
        System.out.println("\nWilderness Map:\n");
        wildernessMap.display();
    }


}