package main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by perri on 08/05/2018.
 */
public class GenericEditingController {

    public Button returnToMainMenu;

    public void returnToMainMenu() throws IOException{
        Stage stage;
        Parent root;

        stage=(Stage) returnToMainMenu.getScene().getWindow();

        root = FXMLLoader.load(getClass().getResource("res/homeScreen.fxml"));

        stage.setScene(new Scene(root, 1000, 820));
        stage.show();
    }





    private boolean checkIfGraphIsCorrect() {
        return true;
    }
}
