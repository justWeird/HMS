/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Abumuhab
 */
public class HMS extends Application {
    //making a static stage viariable for the mainStage so it can be refrenced outside of the class without instantiating the class
    public static Stage mainStage;
    public static Stage Substage;
    public static Scene minScene, dBoard;
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        mainStage=stage;
        minScene= scene;
        mainStage.setResizable(false);
        mainStage.initStyle(StageStyle.UNDECORATED);//this line of code simply removes the default windows minimize,close and exit button so we just make ours
        mainStage.setScene(scene);
        mainStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
