package Viikko15;

class PixelGrid {
    private final int[][] grid = new int[8][8];
    private int cursorX = 0, cursorY = 0;

    public void moveCursorUp() {
        cursorY = Math.max(0, cursorY - 1);
    }

    public void moveCursorDown() {
        cursorY = Math.min(7, cursorY + 1);
    }

    public void moveCursorLeft() {
        cursorX = Math.max(0, cursorX - 1);
    }

    public void moveCursorRight() {
        cursorX = Math.min(7, cursorX + 1);
    }

    public void togglePixel() {
        grid[cursorY][cursorX] = grid[cursorY][cursorX] == 0 ? 1 : 0;
    }

    public int[][] getGrid() {
        return grid;
    }

    public int getCursorX() {
        return cursorX;
    }

    public int getCursorY() {
        return cursorY;
    }
}