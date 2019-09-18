package hms;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class DashSubController {

    @FXML
    private VBox switchUp;
    @FXML
    private JFXButton inbox;
    @FXML
    private JFXButton finance;
    @FXML
    private JFXButton management;
    @FXML
    private JFXButton database;
    @FXML
    private JFXButton Reserve;
    @FXML
    private JFXButton PBook;
    @FXML
    private JFXButton RMPanel;
    @FXML
    private JFXButton HStore;
    @FXML
    private JFXButton HKeeping;
    @FXML
    private JFXButton Laundry;

    @FXML
    private JFXButton RMService;

    @FXML
    private JFXButton FCentre;

    
    private VBox Dboard;
    
    
    @FXML
    void Laundry(ActionEvent event) {
        Dashboard.getInstance().createPage(Dboard, "/fxml/Laundry.fxml");
    }

    @FXML
    void RMService(ActionEvent event) {
        Dashboard.getInstance().createPage(Dboard, "/fxml/RMService.fxml");
    }

    @FXML
    void bookPool(ActionEvent event) {
        Dashboard.getInstance().createPage(Dboard, "/fxml/Pool.fxml");
    }

    @FXML
    void hotelStore(ActionEvent event) {
        Dashboard.getInstance().createPage(Dboard, "/fxml/HStore.fxml");
    }

    @FXML
    void houseKeeping(ActionEvent event) {
        Dashboard.getInstance().createPage(Dboard, "/fxml/HKeeping.fxml");
    }

    @FXML
    void keepFit(ActionEvent event) {
        Dashboard.getInstance().createPage(Dboard, "/fxml/FCentre.fxml");
    }

    @FXML
    void makeReservations(ActionEvent event) {
        Dashboard.getInstance().createPage(Dboard, "/fxml/Reserve.fxml");
    }

    @FXML
    void roomPanel(ActionEvent event) {
        Dashboard.getInstance().createPage(Dboard, "/fxml/RMPanel.fxml");
    }
    
    @FXML
    void mouseOut(MouseEvent event) {

    }

    @FXML
    void mouseOver(MouseEvent event) {

    }

    

}
