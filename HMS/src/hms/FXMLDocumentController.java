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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.*;

/**
 *
 * @author Abumuhab
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Pane loginPane;
    @FXML
    private Button loginButton;
    @FXML
    private TextField usernameField;
    @FXML
    private Button registerButton;
    @FXML
    private ImageView exitButton;
    @FXML
    private ImageView minimizeButton;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label errorLabel;
    
    private Pane logs;
    
    private static FXMLDocumentController instance;
    
    public FXMLDocumentController(){
        instance = this;
    }
    
    public static FXMLDocumentController getInstance(){
        return instance;
    }
    
    public void setNode(Node node){
        loginPane.getChildren().clear();
        loginPane.getChildren().add((Node) node);
    }
    
    public void createPage(Pane homeN, String loc){
        
        try{
            homeN = FXMLLoader.load(getClass().getResource(loc));
            setNode(homeN);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    
    
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    
    
    
    //this method handles the event of our exit button. it minimizes the stage when clicke
    //Note! the HMS.mainStage variable is a refrence to the main stage variable we made static in the "HMS class" (check the HMS class for details)
    @FXML
    private void exitButtonClicked(MouseEvent event) throws IOException {
        
        Stage eXit = new Stage();
        Parent Bye = FXMLLoader.load(getClass().getResource("/fxml/CBox.fxml"));
        HMS.Substage = eXit;
        Scene scenE = new Scene(Bye);
        scenE.setFill(Color.TRANSPARENT);
        eXit.setScene(scenE);
        eXit.initModality(Modality.APPLICATION_MODAL);      //This line ensures that no other window can be accessed unless this particular one closes
        eXit.initStyle(StageStyle.TRANSPARENT);
        eXit.setTitle("QUIT?");
        eXit.show();
        
    }

    
    
    //this method handles the event of our custom minimize button. it minimizes the stage when clicke
    //Note! the HMS.mainStage variable is a refrence to the main stage variable we made static in the "HMS class" (check the HMS class for details)
    @FXML
    private void minimizeButtonClicked(MouseEvent event) {
        HMS.mainStage.setIconified(true);//minimizes the stage
    }

    //handles event for the mouse over event for our custom exit button and minimize button
    //this funtion sets the opacity to 0.5(transparent) when the mouse is ontop of the icon(exit or minimize button)
    @FXML
    private void mouseOver(MouseEvent event) {
        ImageView icon=(ImageView)event.getSource();
        icon.setOpacity(0.5);
    }

    
    
    //handles event for the mouse over event for our custom exit button and minimize button
    //this funtion return the opacity to default 1(solid) when the mouse is no longer on top of the icon(exit or minimize buton)
    @FXML
    private void mouseOut(MouseEvent event) {
        ImageView icon=(ImageView)event.getSource();
        icon.setOpacity(1);
    }

    
     @FXML
    private void loginButtonClicked(ActionEvent event){
        login();
    }
    
    @FXML
    private void confirmEntry(KeyEvent event) {
    if (event.getCode() == KeyCode.ENTER )
    login();
    }
    
    @FXML
    private void RegNewAdmin(ActionEvent event) {
         
        this.getInstance().createPage(logs, "/fxml/RegNewAdmin.fxml");
        
    }
    
    
    //handles the events that occurs when the login button is clicked
    private void login() {
        //login details
        //Note: the login details are just for the developement stages and would be romoved later on
        //the login details would then be replaced by other admins and users after their registration phase
        //for now, the only login details that works is the one below. 
        String user="root";
        String pass="jcodepool";
        
        
        //the following lines of code gets the username and password from our javafx fields and store them in varibles
        String username=usernameField.getText();
        String password=passwordField.getText();
        
        
        //the following block of codes tests if the username and password matches with the allowed username and poasswords and decides what actions to take
        if(user.equals(username)&&pass.equals(password)) 
        {
            Scene scene=new Scene(new Dashboard());
            HMS.mainStage.setScene(scene);
            HMS.dBoard = scene;
            usernameField.clear();
            passwordField.clear();
            if (errorLabel.isVisible())
                errorLabel.setVisible(false);
        }
        else
        {
            errorLabel.setVisible(true);
        }
    }
    
   

    
    
}
