package core;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class LoginUIController {

    //Schnittstelle schnitt = new Schnittstelle();

    @FXML
    TextField txfPassword;
    @FXML
    TextField txfUsername;
    @FXML
    Button btnOK;

    public void btnOK_OnClick(ActionEvent actionEvent) {
        /*
        Vector users = schnitt.getUsers();
        for ( User u : users ) {
            if ( u.getName().equals(txfUsername.getText()) && schnitt.checkPasswordHash(txfPassword.getText()) ) {
                Stage stage = (Stage) btnOK.getScene().getWindow();
                new MainUI();
                stage.close();
            }
        }
        */
    }



}
