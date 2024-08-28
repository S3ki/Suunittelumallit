package Viikko1;
import java.util.Random;

public abstract class Map {
    int width;
    int height;
    Tile[][] tiles;
    Random random;

    public Map(int width, int height) {
        this.width = width;
        this.height = height;
        this.tiles = new Tile[width][height];
        this.random = new Random();
        loadMapSize();
    }

    abstract Tile createTile();

    private void loadMapSize() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                tiles[i][j] = createTile();
            }
        }
    }

    public void display() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(tiles[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }
}