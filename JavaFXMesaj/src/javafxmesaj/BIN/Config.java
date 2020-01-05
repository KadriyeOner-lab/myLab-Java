/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmesaj.BIN;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;

/**
 *
 * @author kadriye
 */
public class Config {
    public static void AnchorPaneConst(Region region , double top , double left , double right , double bottom){
        AnchorPane.setLeftAnchor(region, left);
        AnchorPane.setRightAnchor(region, right);
        AnchorPane.setBottomAnchor(region, bottom);
        AnchorPane.setTopAnchor(region, top);  
    }
    
}
