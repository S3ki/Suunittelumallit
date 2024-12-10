package Viikko15;


class GenerateCodeCommand implements Command {
    private final PixelGrid grid;

    public GenerateCodeCommand(PixelGrid grid) {
        this.grid = grid;
    }

    @Override
    public void execute() {
        int[][] gridState = grid.getGrid();
        System.out.println("int[][] pixelArt = {");
        for (int[] row : gridState) {
            System.out.print("    {");
            for (int cell : row) {
                System.out.print(cell + ", ");
            }
            System.out.println("},");
        }
        System.out.println("};");
    }
}