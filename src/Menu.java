import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;

public class Menu extends Application {
    private BorderPane root;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Octo Journey");

        root = new BorderPane();

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(dimension);

        Scene scene = new Scene(root, dimension.getWidth(), dimension.getHeight());

        stage.setMaximized(true);
        stage.setFullScreen(true);
        stage.setScene(scene);

        createButtons();

        stage.show();
    }

    private void startGame() {
        // TODO: Setup everything that needs to be done for displaying the game
    }

    private void openSettings() {
        // TODO: Display the settings menu to the user
    }

    private void createButtons() {
//        Button startGameButton = new Button("Start Game");
//        startGameButton.setOnAction(e -> startGame());

//        Button settingsButton = new Button("Settings");
//        settingsButton.setOnAction(e -> openSettings());

        Button exitButton = new Button("Exit");
        exitButton.setOnAction(e -> System.exit(0));
    }

    public static void main(String[] args) {
        launch(args);
    }

}
