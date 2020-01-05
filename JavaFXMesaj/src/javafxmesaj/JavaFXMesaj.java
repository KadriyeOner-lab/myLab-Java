/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmesaj;

import Login.Login;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafxmesaj.BIN.Database;

/**
 *
 * @author kadriye
 */
public class JavaFXMesaj extends Application {

    public static Stage stage;

    @Override
    public void start(Stage stage) throws Exception {
        JavaFXMesaj.stage = stage;

        Database database = new Database();
        database.connect();

//        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Login root = new Login();

        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.show();

        stage.setOnCloseRequest((event) -> {

            database.disconnected();
        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    }

}
