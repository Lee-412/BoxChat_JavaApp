package com.example.demo1;
import javafx.scene.control.ScrollPane;

public class ScrollPaneUtils {
    public static void scrollToBottom(ScrollPane scrollPane) {

            // ScrollPane tự động cuộn xuống dưới cùng khi có thay đổi trong nội dung
            scrollPane.setVvalue(1.0);
            scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
            scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

}}
