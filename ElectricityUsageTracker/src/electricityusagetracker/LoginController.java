package electricityusagetracker;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXPasswordField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

//Database imports
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class LoginController implements Initializable {
    
    @FXML
    private JFXTextField user;
    
    @FXML
    private JFXPasswordField pass;
    
    @FXML
    private Label label;
            
    @FXML
    public void signInButtonAction(ActionEvent event) throws IOException, Exception
    {
        String admin_user = "admin";
        String admin_password = "password";
        String user_user = user.getText();
        String user_password = pass.getText();
        
        //Database
        Connection conn=null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            conn = DriverManager.getConnection("jdbc:sqlserver://FS1;databaseName=DB5", "Db5User", ":8qmztC7");
            if(conn!=null){
                System.out.println("Database Successfully connected");
            }
        }
        catch (Exception e){
                throw e;
            }
                     
            String sql = "CREATE TABLE REGISTRATION " +
                   "(id INTEGER not NULL, " +
                   " first VARCHAR(255), " + 
                   " last VARCHAR(255), " + 
                   " age INTEGER, " + 
                   " PRIMARY KEY ( id ))"; 
            
            
        
       
        if ((user_user.equals(admin_user)) && (user_password.equals(admin_password))) 
        {
            Stage stage = new Stage(); 
            Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else
        {
            label.setText("Incorrect username or password");
            
        }
             
    }
    
    @FXML
    public void createAccountButtonAction(ActionEvent event) throws IOException
    {
        
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("CreateAccount.fxml"));
            Scene scene = new Scene(root);
                        
            stage.setScene(scene);
            stage.show();
        
    }
          
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}


//#48D4CA
//#28A89D
//#202F27
//#C3BB96
//#4C6431
