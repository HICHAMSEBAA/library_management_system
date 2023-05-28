package library.library;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomePageController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}