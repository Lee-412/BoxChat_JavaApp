package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/com/example/demo1/image/message.png")));
        primaryStage.getIcons().add(icon);

        Scene scene = new Scene(fxmlLoader.load(), 400, 600);

        primaryStage.setTitle("Box chat");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
