package Viikko15;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class PixelArtEditor extends Application {
    private final PixelGrid grid = new PixelGrid();
    private final Invoker invoker = new Invoker();

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Canvas canvas = new Canvas(400, 400);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.setCenter(canvas);

        VBox buttonBox = new VBox();
        Button generateCodeButton = new Button("Generate Code");
        buttonBox.getChildren().add(generateCodeButton);
        root.setRight(buttonBox);

        generateCodeButton.setOnAction(e -> {
            invoker.setCommand(new GenerateCodeCommand(grid));
            invoker.executeCommand();
        });

        root.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP -> invoker.setCommand(new MoveCursorUpCommand(grid));
                case DOWN -> invoker.setCommand(new MoveCursorDownCommand(grid));
                case LEFT -> invoker.setCommand(new MoveCursorLeftCommand(grid));
                case RIGHT -> invoker.setCommand(new MoveCursorRightCommand(grid));
                case SPACE -> invoker.setCommand(new TogglePixelCommand(grid));
            }
            invoker.executeCommand();
            drawGrid(gc);
        });

        drawGrid(gc);

        Scene scene = new Scene(root, 600, 600);
        primaryStage.setTitle("Pixel Art Editor");
        primaryStage.setScene(scene);
        primaryStage.show();

        root.requestFocus();
    }

    private void drawGrid(GraphicsContext gc) {
        gc.clearRect(0, 0, 400, 400);
        gc.setStroke(Color.GRAY);

        for (int i = 0; i <= 8; i++) {
            gc.strokeLine(i * 50, 0, i * 50, 400);
            gc.strokeLine(0, i * 50, 400, i * 50);
        }

        int[][] gridState = grid.getGrid();
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                if (gridState[y][x] == 1) {
                    gc.setFill(Color.BLACK);
                    gc.fillRect(x * 50, y * 50, 50, 50);
                }
            }
        }

        gc.setStroke(Color.RED);
        gc.strokeRect(grid.getCursorX() * 50, grid.getCursorY() * 50, 50, 50);
    }


}