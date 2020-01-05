/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmesaj.Gelen;

import Pojo.DataType;
import com.gluonhq.charm.glisten.control.Avatar;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafxmesaj.BIN.ICards;

/**
 * FXML Controller class
 *
 * @author kadriye
 * @param <T>
 */
public class Gelen<T extends Pojo.Message> extends HBox implements ICards<T> {

    private T t;

    @FXML
    private Avatar UserImage;

    @FXML
    private Label UserName;

    @FXML
    private Circle Online;

    @FXML
    private Label Mesaj;

    @FXML
    private Label Time;

    @FXML
    private Label Count;


    public Gelen() {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Gelen.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException ex) {
            throw new RuntimeException(ex);

        }
        
        this.setOnMouseClicked((event) -> {
            VBox list = (VBox) this.getParent();

            list.getChildren().forEach((t) -> {
                Gelen gelen = (Gelen) t;
                gelen.getStyleClass().clear();
                gelen.getStyleClass().add("nonSelection");
            });
            this.getStyleClass().add("Selection");

        });

    }

    /**
     * Initializes the controller class.
     */
    @FXML
    private void initialize() {
        // TODO
    }

    @Override
    public T getData() {
        return t;
    }

    @Override
    public void setData(T t) {
        this.t = t;
        UserImage.setImage(new Image(new ByteArrayInputStream(t.getUsersByKimden().getImage())));
        UserName.setText(t.getUsersByKimden().getFirstName()+ " "+ t.getUsersByKimden().getLastName());
        Mesaj.setText(t.getMesaj());
    }

    public void setMesaj(String Mesaj) {
        this.Mesaj.setText(Mesaj);
    }
   

}
