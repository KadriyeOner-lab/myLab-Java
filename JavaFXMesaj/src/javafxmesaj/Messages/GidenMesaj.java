/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmesaj.Messages;

import Pojo.DataType;
import com.gluonhq.charm.glisten.control.Avatar;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafxmesaj.BIN.ICards;
import javassist.bytecode.ByteArray;

/**
 * FXML Controller class
 *
 * @author kadriye
 */
public class GidenMesaj<T extends Pojo.Message> extends HBox implements ICards<T> {

    private T t;
    @FXML
    private Avatar UserImage;

    @FXML
    private Label Message;

    @FXML
    private Label Time;

    @FXML
    private ImageView Check;

    public GidenMesaj() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("GidenMesaj.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException ex) {
            throw new RuntimeException(ex);

        }
    }

    @FXML
    private void initialize() {
    }

    public Avatar getUserImage() {
        return UserImage;
    }

    public void setUserImage(Avatar UserImage) {
        this.UserImage = UserImage;
    }

    public String getMessage() {
        return Message.getText();
    }

    public void setMessage(String Message) {
        this.Message.setText(Message);
    }

    public String getTime() {
        return Time.getText();
    }

    public void setTime(String Time) {
        this.Time.setText(Time);
    }

    public ImageView getCheck() {
        return Check;
    }

    public void setCheck(ImageView Check) {
        this.Check = Check;
    }

    @Override
    public T getData() {
        return this.t;
    }

    @Override
    public void setData(T t) {
        this.t = t;
       UserImage.setImage(new Image(new ByteArrayInputStream(t.getUsersByKimden().getImage())));
       Message.setText(t . getMesaj());
       Time.setText(t .getZaman().toString());
    }

}
