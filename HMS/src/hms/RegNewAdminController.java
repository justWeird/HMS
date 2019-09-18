package hms;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

public class RegNewAdminController {

    @FXML
    private Pane RegNewAdmin;
    @FXML
    private TextField usernameField1;
    @FXML
    private PasswordField passwordField1;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button registerButton;
    @FXML
    private Button loginButton;

    private Pane Regis;
    
    @FXML
    void confirmEntry(KeyEvent event) {

    }

    @FXML
    void loginButtonClicked(ActionEvent event) {
     
       FXMLDocumentController.getInstance().createPage(Regis, "/fxml/login.fxml");
    }

    @FXML
    void regNewAdmin(ActionEvent event) {

    }

}
