package com.example.chat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

    @FXML public TextArea textAria;
    @FXML public Button SendButtom;
    @FXML public TextField textField;
    @FXML public ListView<String> userList;

    public void sendButtomMessage(ActionEvent actionEvent) {
        if (!textField.getText().isEmpty()) {
            textAria.appendText(textField.getText());
            textAria.appendText(System.lineSeparator());
            textField.clear();
        }
    }

}