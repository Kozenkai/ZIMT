package core;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;

public class MainUIController {

    @FXML
    TableColumn colApaRent, colApaTenant, colApaRooms, colApaSize, colApaBalcony, colHouApartments, colHouAddress, colHouLastCleaned, colHouBasement, colTenFirstName , colTenLastName, colTenSince, colTenBehind, colUseUsername;
    @FXML
    Button btnRent;

    @FXML
    void btnRent_OnClick(ActionEvent actionEvent) {
        // rent++
    }
}
