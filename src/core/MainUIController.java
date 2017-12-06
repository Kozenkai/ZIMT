package core;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainUIController {

    @FXML
    TableColumn<Apartment, String> colApaRent, colApaTenant, colApaRooms, colApaSize, colApaBalcony;
    @FXML
    TableColumn<House, String> colHouApartments, colHouAddress, colHouLastCleaned, colHouBasement;
    @FXML
    TableColumn<Tenant, String> colTenFirstName , colTenLastName, colTenSince, colTenOverdue;
    @FXML
    TableColumn<User, String> colUseUsername, colUsePassword, colUseIsAdmin;
    @FXML
    TableView<Apartment> tbvApartments;
    @FXML
    TableView<House> tbvHouses;
    @FXML
    TableView<Tenant> tbvTenants;
    @FXML
    TableView<User> tbvUsers;
    @FXML
    Button btnRent;

    private int rent;

    public void initialize() {
        colApaRent.setCellValueFactory(new PropertyValueFactory<>("rent"));
        colApaTenant.setCellValueFactory(new PropertyValueFactory<>("tenant"));
        colApaRooms.setCellValueFactory(new PropertyValueFactory<>("rooms"));
        colApaSize.setCellValueFactory(new PropertyValueFactory<>("size"));
        colApaBalcony.setCellValueFactory(new PropertyValueFactory<>("balcony"));

        colHouApartments.setCellValueFactory(new PropertyValueFactory<>("apartments"));
        colHouAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colHouLastCleaned.setCellValueFactory(new PropertyValueFactory<>("lastCleaned"));
        colHouBasement.setCellValueFactory(new PropertyValueFactory<>("basementSize"));

        colTenFirstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        colTenLastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        colTenSince.setCellValueFactory(new PropertyValueFactory<>("rentalPeriod"));
        colTenOverdue.setCellValueFactory(new PropertyValueFactory<>("overdue"));

        colUseUsername.setCellValueFactory(new PropertyValueFactory<>("username"));
        colUsePassword.setCellValueFactory(new PropertyValueFactory<>("password"));
        colUseIsAdmin.setCellValueFactory(new PropertyValueFactory<>("isAdmin"));

        rent = 1;
    }

    @FXML
    void btnRent_OnClick(ActionEvent actionEvent) {
        rent++;
    }
}
