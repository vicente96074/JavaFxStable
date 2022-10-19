package com.softquark.views;

import com.softquark.App;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Oficina_Afaas
 */
public class Login {

    public static void loadView(Stage stage) {
        try {
            Parent view = FXMLLoader.load(Login.class.getResource("Login.fxml"));
            stage.setScene(new Scene(view));
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
