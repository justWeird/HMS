package hms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

public class loginController {

    @FXML
    private Pane loginPane;

    @FXML
    private Label errorLabel;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button registerButton;

    private Pane login;
    
    @FXML
    void RegNewAdmin(ActionEvent event) {
        
        FXMLDocumentController.getInstance().createPage(login, "/fxml/RegNewAdmin.fxml");
    }

    @FXML
    void confirmEntry(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER )
    login();
    }

    @FXML
    void loginButtonClicked(ActionEvent event) {
        login();
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
