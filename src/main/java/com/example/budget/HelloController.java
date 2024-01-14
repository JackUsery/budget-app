/*
@Author: Jack Usery
@Assignment: Final Project
@Date: 11/1/2023

 */


package com.example.budget;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}