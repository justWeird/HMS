/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
/**
 * FXML Controller class
 *
 * @author Abumuhab
 */
public class Dashboard extends HBox implements Initializable
{

    /**
     * Initializes the controller class.
     */
    
@FXML
    private ImageView inbox;

    @FXML
    private ImageView finance;

    @FXML
    private ImageView management;

    @FXML
    private ImageView database;

    @FXML
    private HBox dashboard;

    @FXML
    private Button logoutButton;

    @FXML
    private Text reservation;

    @FXML
    private Text store;

    @FXML
    private Text roomPanel;

    @FXML
    private Text poolBooking;

    @FXML
    private Text hKeeping;

    @FXML
    private Text laundry;

    @FXML
    private Text roomService;

    @FXML
    private Text fitness;

    @FXML
    void logoutButtonClicked(ActionEvent event)
    {

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
    public Dashboard()
    {
        FXMLLoader fxmlloader=new FXMLLoader(getClass().getResource("dashboard.fxml"));
        try
        {
            fxmlloader.setRoot(this);
            fxmlloader.setController(this);
            fxmlloader.load();
}
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
