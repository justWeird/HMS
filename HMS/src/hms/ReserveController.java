/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import com.jfoenix.controls.JFXButton;
import hms.HMS;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author FADIJI JOSEPH
 */
public class ReserveController implements Initializable {

    @FXML
    private VBox reserve;
    @FXML
    private Button backBtn;
    @FXML
    private JFXButton inbox;
    @FXML
    private JFXButton finance;
    @FXML
    private JFXButton management;
    @FXML
    private JFXButton database;

    private VBox res;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goBack(ActionEvent event) {
       Dashboard.getInstance().createPage(res, "/fxml/dashSub.fxml");
    }

    @FXML
    private void mouseOut(MouseEvent event) {
        Button icon=(Button)event.getSource();
        icon.setOpacity(0.5);
    }

    @FXML
    private void mouseOver(MouseEvent event) {
        Button icon=(Button)event.getSource();
        icon.setOpacity(2.5);
    }
    
}
