package sample.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.classes.Main;

import java.io.IOException;

public class DeleteInfo {
    @FXML
    private Button acceptButton;

    @FXML
    void initialize() throws ClassNotFoundException {

        acceptButton.setOnAction(event -> {
            System.exit(0);
        });
    }


}

