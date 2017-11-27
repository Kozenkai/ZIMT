package core;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class LoginUIController {

    @FXML
    TextField txfPassword;
    @FXML
    TextField txfUsername;
    @FXML
    Button btnOK;

    public void btnOK_OnClick(ActionEvent actionEvent) {
        Stage stage = (Stage) btnOK.getScene().getWindow();
        new MainUI();
        stage.close();
/*        Parent root = FXMLLoader.load(getClass().getResource("loginUI.fxml"));
        primaryStage.setTitle("ZIMT GmbH & Co KG. - login");
        primaryStage.setScene(new Scene(root));*/
    }
}
