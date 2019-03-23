package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/views/main.fxml"));
        primaryStage.setTitle("Configurador de entornos");
        primaryStage.setScene(new Scene(root, 750, 500));
        primaryStage.getIcons().add(new Image("file:./src/views/images/iconoApp.gif"));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
