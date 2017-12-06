package core;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewAccountUIController {

    @FXML
    TextField txfName;
    @FXML
    Button btnCreate;
    @FXML
    private TextField txfPassword = new TextField();
    @FXML
    private PasswordField pwdPassword = new PasswordField();
    @FXML
    private CheckBox chkShowPassword = new CheckBox("Show/Hide password");

    public void initialize() {
        txfPassword.setManaged(false);
        txfPassword.setVisible(false);
        txfPassword.managedProperty().bind(chkShowPassword.selectedProperty());
        txfPassword.visibleProperty().bind(chkShowPassword.selectedProperty());
        pwdPassword.managedProperty().bind(chkShowPassword.selectedProperty().not());
        pwdPassword.visibleProperty().bind(chkShowPassword.selectedProperty().not());
        txfPassword.textProperty().bindBidirectional(pwdPassword.textProperty());
    }

    @FXML
    void btnCreate_OnClick(ActionEvent actionEvent) {
        String name = txfName.getText();
        String password = pwdPassword.getText();
        // if no error
        Stage stage = (Stage) txfName.getScene().getWindow();
        stage.close();
    }
}
