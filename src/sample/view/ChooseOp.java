package sample.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.classes.Main;

import java.io.IOException;

public class ChooseOp {

    @FXML
    private Button checkButton;

    @FXML
    private Button moneyButton;

    @FXML
    private Button internetButton;

    @FXML
    private Button mobileButton;

    @FXML
    private Button getCard;

    @FXML
    private Button transferButton;

    @FXML
    void initialize() throws ClassNotFoundException {

        checkButton.setOnAction(event -> {
            try {
                Parent root = FXMLLoader.load(Main.class.getResource("../view/CheckCash.fxml"));
                Stage stage = (Stage) checkButton.getScene().getWindow();
                stage.setTitle("Choose");
                stage.setScene(new Scene(root, 750, 350));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        moneyButton.setOnAction(event -> {
            try {
                Parent root = FXMLLoader.load(Main.class.getResource("../view/getCash.fxml"));
                Stage stage = (Stage) moneyButton.getScene().getWindow();
                stage.setTitle("money");
                stage.setScene(new Scene(root, 750, 350));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        internetButton.setOnAction(event -> {
            try {
                Parent root = FXMLLoader.load(Main.class.getResource("../view/Internet.fxml"));
                Stage stage = (Stage) internetButton.getScene().getWindow();
                stage.setTitle("internet");
                stage.setScene(new Scene(root, 750, 350));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        mobileButton.setOnAction(event -> {
            try {
                Parent root = FXMLLoader.load(Main.class.getResource("../view/Mobile.fxml"));
                Stage stage = (Stage) mobileButton.getScene().getWindow();
                stage.setTitle("mobile");
                stage.setScene(new Scene(root, 750, 350));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        transferButton.setOnAction(event -> {
            try {
                Parent root = FXMLLoader.load(Main.class.getResource("../view/Transfer.fxml"));
                Stage stage = (Stage) transferButton.getScene().getWindow();
                stage.setTitle("Choose");
                stage.setScene(new Scene(root, 750, 350));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        getCard.setOnAction(event -> {
            try {
                Parent root = FXMLLoader.load(Main.class.getResource("../view/GetCard.fxml"));
                Stage stage = (Stage) transferButton.getScene().getWindow();
                stage.setTitle("get");
                stage.setScene(new Scene(root, 750, 350));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
