package UI.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button login;

    @Override
    public void initialize(URL url, ResourceBundle resources) {
        username.setText("");
        password.setText("");
        login.setOnAction((ActionEvent e) -> {
            String usernameContent = username.getText();
            String passwordContent = password.getText();

            if (usernameContent.equals("")) {
                errorMessage("username is empty");
                return;
            }

            if (passwordContent.equals("")) {
                errorMessage("password is empty");
                return;
            }

            System.out.println("Username: " + usernameContent);
            System.out.println("Password: " + passwordContent);
        });
    }

    public void errorMessage(String error) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error Dialog");
        alert.setHeaderText(null);
        String message;
        switch (error) {
            case "username is empty":
                message = "用户名不可为空！";
                break;
            case "password is empty":
                message = "密码不可为空！";
                break;
            case "username does not exist":
                message = "用户名不存在！";
                break;
            case "password is wrong":
                message = "输入密码错误！";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + error);
        }
        alert.setContentText(message);

        alert.showAndWait();
    }
}
