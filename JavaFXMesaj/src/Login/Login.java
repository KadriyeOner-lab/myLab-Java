/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Pojo.Users;
import java.io.IOException;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafxmesaj.BIN.DatabaseManager;

/**
 * FXML Controller class
 *
 * @author kadriye
 */
public class Login extends HBox {
    
    @FXML
    private TextField userName;
    
    @FXML
    private PasswordField password;
    
    @FXML
    private Label userMessage;

    /**
     * Initializes the controller class.
     */
    public Login() {
        
        FXMLLoader fXMLLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
        fXMLLoader.setRoot(this);
        fXMLLoader.setController(this);
        
        try {
            fXMLLoader.load();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    @FXML
    private void initialize() {
        // TODO
    }
    
    @FXML
    void login(ActionEvent event) throws IOException {
        if (isControl()) {
            
            DatabaseManager<Pojo.Users> users = new DatabaseManager(Pojo.Users.class);
            
            ObservableList<Pojo.Users> control = users.gets().filtered(t -> t.getUserName().equals(userName.getText())
                    && t.getPassword().equals(password.getText()));
            if (!control.isEmpty()) {
                LoginSession.userSession= control.get(0);
                Parent root = FXMLLoader.load(javafxmesaj.JavaFXMesaj.class.getResource("FXMLDocument.fxml"));
                Scene scene = new Scene(root);
                javafxmesaj.JavaFXMesaj.stage.setScene(scene);
                
                
            } else {
                message("No such user..Please check user information!.");
                
            }
            
        } else {
            message("Please fill in all fields!..");
        }
    }
    
    private boolean isControl() {
        userMessage.setVisible(false);
        return (userName.getText() != null) && !"".equals(userName.getText()) && (password.getText() != null) && !"".equals(password.getText());
    }

    private void message(String message) {
        userMessage.setVisible(true);
        userMessage.setText(message);
    }
}
