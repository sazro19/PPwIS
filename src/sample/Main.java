package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// нет хэндлеров в диаграмме классов, непонятно, как реализовать GUI

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        ATM atm = new ATM();
        CardOwner cardOwner = new CardOwner();
    }

     public void exit(){}

    public static void main(String[] args) {
        launch(args);
    }
}
