/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import com.jfoenix.controls.JFXButton;
import hms.HMS;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
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
    private JFXButton inbox;

    @FXML
    private JFXButton finance;

    @FXML
    private JFXButton management;

    @FXML
    private JFXButton database;
    
    @FXML
    private VBox switchUp;

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
    
    @FXML
    private HBox dashboard;

    @FXML
    private Button logoutButton;

    private VBox con;

    private static Dashboard instance;
   
    
    public static Dashboard getInstance(){
        return instance;
    }
    
    public void setNode(Node node){
        switchUp.getChildren().clear();
        switchUp.getChildren().add((Node) node);
    }
    
    public void createPage(VBox homeN, String loc){
        
        try{
            homeN = FXMLLoader.load(getClass().getResource(loc));
            setNode(homeN);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    
    @FXML
    private void logoutButtonClicked(ActionEvent event)
    {
            HMS.mainStage.setScene(HMS.minScene);
           
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
    
    //handles event for the mouse over event for our custom logout button
    //this funtion sets the opacity to 0.5(transparent) when the mouse is ontop of the icon(exit or minimize button)
    @FXML
    private void mouseOver(MouseEvent event) {
        Button icon=(Button)event.getSource();
        icon.setOpacity(0.5);
    }
    
    //handles event for the mouse over event for our custom logout button
    //this funtion return the opacity to default 1(solid) when the mouse is no longer on top of the icon(exit or minimize buton)
    @FXML
    private void mouseOut(MouseEvent event) {
        Button icon=(Button)event.getSource();
        icon.setOpacity(2.5);
    }
    
     @FXML
    private void makeReservations(ActionEvent event) throws IOException
    {
            this.getInstance().createPage(con, "/fxml/Reserve.fxml");
    }
    
    @FXML
    private void bookPool(ActionEvent event) throws IOException{
             this.getInstance().createPage(con, "/fxml/Pool.fxml");
        
    }
    
    @FXML
    private void roomPanel(ActionEvent event) throws IOException{
             this.getInstance().createPage(con, "/fxml/RMPanel.fxml");
        
    }
    
    @FXML
    private void hotelStore(ActionEvent event) throws IOException{
             this.getInstance().createPage(con, "/fxml/HStore.fxml");
        
    }
    
    @FXML
    private void houseKeeping(ActionEvent event) throws IOException{
             this.getInstance().createPage(con, "/fxml/HKeeping.fxml");
        
    }
    
    @FXML
    private void Laundry(ActionEvent event) throws IOException{
             this.getInstance().createPage(con, "/fxml/Laundry.fxml");
        
    }
    
    @FXML
    private void RMService(ActionEvent event) throws IOException{
             this.getInstance().createPage(con, "/fxml/RMService.fxml");
        
    }
    
    @FXML
    private void keepFit(ActionEvent event) throws IOException{
            this.getInstance().createPage(con, "/fxml/FCentre.fxml");
        
    }
    
    
    public Dashboard()
    {
        instance = this;
        
        FXMLLoader fxmlloader=new FXMLLoader(getClass().getResource("/fxml/dashboard.fxml"));
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
