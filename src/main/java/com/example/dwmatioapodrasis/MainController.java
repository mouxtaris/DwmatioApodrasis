package com.example.dwmatioapodrasis;


import javafx.css.Size;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class MainController {

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button choiceBtn1;

    @FXML
    private Button choiceBtn2;

    @FXML
    private Label label;

    public int tries = 0;
    public boolean btn1IsPressed;
    public boolean btn2IsPressed;
    public String btn1Text;
    public String btn2Text;

    public void choiceButton1 (ActionEvent e){
        btn1IsPressed = true;
        label.setText(btn1Text);
    }

    public void choiceButton2 (ActionEvent e){
        btn2IsPressed = true;
        label.setText(btn2Text);
    }


    public void btn1(ActionEvent e){
        label.setText("36+12=");
        choiceBtn1.setDisable(false);
        choiceBtn2.setDisable(false);
        choiceBtn1.setOpacity(1);
        choiceBtn2.setOpacity(1);
        choiceBtn1.setText("48");
        choiceBtn2.setText("58");
        btn1Text = "Σωστά!! Πάμε στο επόμενο επίπεδο";
        btn2Text = "Λάθος!! Προσπάθειες που απομένουν: " + (3-tries);
    }





}
