package UI.chatroom;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("UI/chatroom.fxml")));

        primaryStage.setTitle("Think");
        primaryStage.setScene(new Scene(root, 520, 700));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
