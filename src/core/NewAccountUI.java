package core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

class NewAccountUI {
    NewAccountUI() {

        Stage stage = new Stage();
        stage.setTitle("ZIMT GmbH & Co KG. - New Account");
        try {
            Parent root = FXMLLoader.load(getClass().getResource("newAccountUI.fxml"));
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        stage.setResizable(false);
        stage.show();
        stage.getIcons().add(new Image("/core/icon128.png"));

    }

}
