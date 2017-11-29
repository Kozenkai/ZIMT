package core;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class LoginUIController {

    //Schnittstelle schnitt = new Schnittstelle();

    private ToggleGroup toggleGroup = new ToggleGroup();

    @FXML
    TextField txfPassword;
    @FXML
    TextField txfUsername;
    @FXML
    Button btnOK;
    @FXML
    Button btnNewUser;
    @FXML
    RadioButton rdbGUI;
    @FXML
    RadioButton rdbCLI;

    public void initialize() {
        rdbGUI.setSelected(true);
        rdbCLI.setSelected(false);
        rdbGUI.setToggleGroup(toggleGroup);
        rdbCLI.setToggleGroup(toggleGroup);
    }

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

    public void btnNewUser_OnClick(ActionEvent actionEvent) {

    }
}
