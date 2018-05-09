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
public class HomeController {

    public Button genericEditingButton;
    public Button nymEditingButton;


    public void goToGenericEditing() throws IOException{
        Stage stage;
        Parent root;

        stage=(Stage) genericEditingButton.getScene().getWindow();

        root = FXMLLoader.load(getClass().getResource("res/genericEditing.fxml"));

        stage.setScene(new Scene(root, 1000, 820));
        stage.show();

    }

    public void goToNymEditing() throws IOException{
        Stage stage;
        Parent root;

        stage=(Stage) genericEditingButton.getScene().getWindow();

        root = FXMLLoader.load(getClass().getResource("res/nymEditing.fxml"));

        stage.setScene(new Scene(root, 1000, 820));
        stage.show();
    }

}
