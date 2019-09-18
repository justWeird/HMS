
package hms;

import com.jfoenix.controls.JFXButton;
import hms.HMS;
import hms.HMS;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


/**
 *
 * @author FADIJI JOSEPH
 * This class is built as the controller for a dialog box that ascertains if the user wants to quit
 * It's FXML file is CBox.fxml and has a CSS file linked to it as well called style.css
 */
public class ConfirmationBox extends HBox {
    
    
    @FXML
    private JFXButton yesBtn;
    
    @FXML
    private JFXButton noBtn;
    
    @FXML
    private Pane pane;
    @FXML
    private Label messages;
          
    
    //Simply put, once yes is clicked, it calls the mainStage and Substage variables declared as class variables
    //If yes, it closes itself and also the main stage
    @FXML
     void yesValidation(ActionEvent event){
       HMS.mainStage.close();
       HMS.Substage.close();
       System.exit(0);
        }
     
     //Simply put, once yes is clicked, it calls the mainStage and Substage variables declared as class variables
    //If no, it closes itself.
    @FXML
        void noValidation(ActionEvent event){
            HMS.Substage.close();
        }
        
    
}
      

    

