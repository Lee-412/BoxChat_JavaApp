package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloController {
    @FXML
    private VBox chatArea;

    @FXML
    private TextField messageInput;

    public void sendMessage() {
        String messageText = messageInput.getText().trim();
        if (!messageText.isEmpty()) {
            VBox message = createMessage(messageText);
            chatArea.getChildren().add(message);
            messageInput.clear();
        }
    }
    private VBox createMessage(String text) {
        Text message = new Text(text);
        message.setWrappingWidth(250);
        message.setStyle("-fx-background-color: #DCF8C6; -fx-padding: 5px; -fx-border-radius: 5px;");

        LocalDateTime currentTime = LocalDateTime.now();
        String formattedTime = currentTime.format(DateTimeFormatter.ofPattern("HH:mm"));

        Text timeStamp = new Text("[" + formattedTime + "] ");
        timeStamp.setStyle("-fx-font-size: 10px; -fx-fill: gray;");

        VBox messageContainer = new VBox();
        messageContainer.getChildren().addAll(timeStamp, message);

        return messageContainer;
    }
}
