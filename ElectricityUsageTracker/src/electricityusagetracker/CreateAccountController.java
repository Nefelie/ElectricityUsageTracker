package electricityusagetracker;

import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CreateAccountController implements Initializable {
    
    @FXML
    private JFXTextField newuser;   

    @FXML
    private JFXPasswordField newpass;

    @FXML
    private JFXPasswordField newpass1;
        
    @FXML
    private JFXButton signup;
    
    @FXML
    private Label label;


    @FXML
    public void signUpButtonAction(ActionEvent event) throws IOException {
        
        String user_pass = newpass.getText();
        String user_pass1 = newpass1.getText();


        
        if (user_pass1.equals(user_pass)) 
        {
            Stage stage = new Stage(); 
            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else
        {
            label.setText("Password do not match");
            
        }
        
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
