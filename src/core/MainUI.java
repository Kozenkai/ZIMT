package core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

class MainUI {

    MainUI() {
        Stage stage = new Stage();
        stage.setTitle("TESTING");
        try {
            Parent root = FXMLLoader.load(getClass().getResource("loginUI.fxml"));
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        stage.show();
        stage.getIcons().add(new Image("/core/icon128.png"));

    }

}
