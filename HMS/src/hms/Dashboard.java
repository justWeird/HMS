/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Abumuhab
 */
public class Dashboard extends Pane implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
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
