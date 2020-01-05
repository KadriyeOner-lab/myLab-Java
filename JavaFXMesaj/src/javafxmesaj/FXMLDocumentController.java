/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmesaj;

import Login.LoginSession;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafxmesaj.BIN.DatabaseManager;
import javafxmesaj.Gelen.Gelen;
import javafxmesaj.Messages.GelenMesaj;
import javafxmesaj.Messages.GidenMesaj;

import javafxmesaj.Profil.Profil;

/**
 *
 * @author kadriye
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField MessageText;

    @FXML
    private Label Send;

    @FXML
    private ScrollPane GelenScroll, MessageScroll;

    @FXML
    private VBox kullaniciList, messageList;

    @FXML
    private AnchorPane Profil_Anchor;

    int ID = LoginSession.userSession.getId();
    private boolean control = false;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        Profil userProfil = new Profil();
        Profil_Anchor.getChildren().add(userProfil);

        DatabaseManager<Pojo.Message> kullanicidan = new DatabaseManager(Pojo.Message.class);
        kullanicidan.gets().filtered((t) -> t.getUsersByKime().getId() == ID).forEach((t) -> {

            if (!kullaniciList.getChildren().isEmpty()) {

                for (Node node : kullaniciList.getChildren()) {
                    Gelen gelen = (Gelen) node;
                    if (!Objects.equals(gelen.getData().getUsersByKimden().getId(), t.getUsersByKimden().getId())) {
                        control = true;

                    } else {

                        control = false;
                        gelen.setMesaj(t.getMesaj());
                        break;
                    }
                }
                if (control) {
                    createGelen(t);
                }
            } else {
                createGelen(t);
            }

        });

        MessageText.setOnKeyPressed((event) -> {

            if (event.getCode().equals(KeyCode.ENTER)) {
                Message();
            }
        });

    }

    @FXML
    private void SendClicked(MouseEvent event) {
        Message();
    }

    private void Message() {
        GidenMesaj gidenMesaj = new GidenMesaj();
        gidenMesaj.setMessage(MessageText.getText());
        MessageText.setText("");
    }

    private void createGelen(Pojo.Message t) {
        Gelen gelen = new Gelen();
        gelen.setData(t);
        gelen.setOnMouseClicked((event) -> {
            messageList.getChildren().clear();
            DatabaseManager<Pojo.Message> gelenMesage = new DatabaseManager(Pojo.Message.class);
            gelenMesage.gets().filtered(s -> (s.getUsersByKime().getId() == ID && Objects.equals(s.getUsersByKimden().getId(),t.getUsersByKimden().getId()))
                    || (s.getUsersByKimden().getId() == ID && Objects.equals(s.getUsersByKime().getId(), t.getUsersByKimden().getId()))).forEach((s) -> {
                if (s.getUsersByKimden().getId()==ID) {
                    GidenMesaj giden = new GidenMesaj();
                        giden.setData(s);
                        messageList.getChildren().add(giden);
                }
                else{
                GelenMesaj kgelen = new GelenMesaj();
                kgelen.setData(s);
                messageList.getChildren().add(kgelen);
                
                }
                    });

        });

        kullaniciList.getChildren().add(gelen);
    }
}
