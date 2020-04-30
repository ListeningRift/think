package UI.chatroom;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("UI/chatroom.fxml")));

        Scene scene = new Scene(root, 520, 700);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("UI/chatroom.css").toExternalForm());
        primaryStage.setTitle("Think");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
//        primaryStage.initStyle(StageStyle.UNIFIED);
        primaryStage.show();
    }
}
