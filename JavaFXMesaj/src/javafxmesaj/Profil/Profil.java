/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmesaj.Profil;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafxmesaj.BIN.Config;

/**
 * FXML Controller class
 *
 * @author kadriye
 * @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
 */
public class Profil extends AnchorPane{

    public Profil() {
    FXMLLoader fxmLoader = new FXMLLoader(getClass().getResource("Profil.fxml"));
    fxmLoader.setRoot(this);
    fxmLoader.setController(this);
    
        try {
            fxmLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
                
    

  @FXML
    private void initialize() {
        Config.AnchorPaneConst(this, 0.0, 0.0, 0.0, 0.0);
        
    }    
    
}

