package com.example.demo1;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private VBox chatArea;

    @FXML
    private TextArea messageInput;

    @FXML
    private ScrollPane scrollPanes;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String text = "                                                                                                         ";
        Label newLable = new Label(text);
        newLable.setMaxWidth(500);
        newLable.setWrapText(true);
        newLable.setAlignment(Pos.CENTER_RIGHT);
        chatArea.getChildren().add(newLable);
    }

    public void sendMessage() {

        String messageText = messageInput.getText().trim();

        Label newMessage = new Label(messageText);
        newMessage.getStyleClass().add("message-label");
        newMessage.setMaxWidth(300);
        newMessage.setWrapText(true);

        HBox messageContainer = new HBox(newMessage);
        messageContainer.setAlignment(Pos.CENTER_RIGHT);
        chatArea.getChildren().add(messageContainer);
        messageInput.clear();


        Label botMessage = new Label("Thank you for contacting us, we will respond later");
        botMessage.getStyleClass().add("message-label-bot");
        botMessage.setMaxWidth(300);
        botMessage.setWrapText(true);

        HBox botMessageContainer = new HBox(botMessage);
        botMessageContainer.setAlignment(Pos.CENTER_LEFT);

        chatArea.getChildren().add(botMessageContainer);

        chatArea.heightProperty().addListener((observable, oldValue, newValue) -> {
            scrollPanes.setVvalue(scrollPanes.getVmax());
            scrollPanes.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
            scrollPanes.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        });
}
    public void clickCallVideo (){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("BoxChat Video Call ");
        alert.setHeaderText("Box Chat Video Call");
        alert.setContentText("Box Chat Video Call");
        alert.showAndWait();
    }
    public void clickCall (){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("BoxChat Call ");
        alert.setHeaderText("Box Chat Call");
        alert.setContentText("Box Chat Call");
        alert.showAndWait();
    }

    public void clickSend_Image (){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("BoxChat SendImage ");
        alert.setHeaderText("Box Chat SendImage");
        alert.setContentText("Box Chat SendImage");
        alert.showAndWait();
    }
    public void clickVoice (){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("BoxChat Voice ");
        alert.setHeaderText("Box Chat Voice");
        alert.setContentText("Box Chat Voice");
        alert.showAndWait();
    }

    public void clickUser (){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("BoxChat Infomation User ");
        alert.setHeaderText("Box Chat Infomation User");
        alert.setContentText("Box Chat Infomation User");
        alert.showAndWait();
    }

    public void clickBack (){

    }
}
