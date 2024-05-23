package com.example.dwmatioapodrasis;


import javafx.css.Size;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
    private Label label;
    @FXML
    private ImageView helpImage;
    @FXML
    private Label ARlabel;
    @FXML
    private Button submitBtn;
    @FXML
    private TextField answerTextField;
    @FXML
    private Label messageLabel;

    public int tries = 0;
    public boolean btn1IsPressed;
    public boolean btn2IsPressed;
    public String btn1Text;
    public String btn2Text;
    public int correctAnswer;
    public int buttonNum = 1;

    public void submit(){
        if (Integer.parseInt(answerTextField.getText()) == correctAnswer){
            messageLabel.setOpacity(0.7);
            messageLabel.setText("Σωστά!! Πάμε στην επόμενη ερώτηση");
            helpImage.setOpacity(0);
            ARlabel.setOpacity(0);
            tries = 0;
            if (buttonNum == 1)
                btn2.setDisable(false);
            else if (buttonNum == 2)
                btn3.setDisable(false);
            else if (buttonNum == 3)
                btn4.setDisable(false);
            else
                btn5.setDisable(false);
        }
        else {
            messageLabel.setOpacity(0.7);
            tries += 1;
            messageLabel.setText("Λάθος!! Προσπάθειες που απομένουν " + (3 - tries));
            checkTries(tries);
        }
        if (tries ==3)
            tries = 0;

        if (buttonNum == 5 && Integer.parseInt(answerTextField.getText()) == correctAnswer){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Game Over");
            alert.setHeaderText(null);
            alert.setContentText("Συγχαρητήρια!!! Ήσουν πολύ καλός και ξέφυγες από τον δράκο!!");
            alert.showAndWait();
            btn2.setDisable(true);
            btn3.setDisable(true);
            btn4.setDisable(true);
            btn5.setDisable(true);
            messageLabel.setOpacity(0);
            answerTextField.setOpacity(0);
            submitBtn.setOpacity(0);
        }
    }

    public void checkTries(int tries){
        if (tries == 3){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Game Over");
            alert.setHeaderText(null);
            alert.setContentText("Δεν κατάφερες να φτάσεις στο κάστρο εγκαίρως! Πάμε πάλι από την αρχή.");
            alert.showAndWait();
            label.setText("Λύστε σωστά τις πράξεις για να ξεφύγετε από τον δράκο!");
            btn2.setDisable(true);
            btn3.setDisable(true);
            btn4.setDisable(true);
            btn5.setDisable(true);
            messageLabel.setOpacity(0);
            answerTextField.setOpacity(0);
            answerTextField.clear();
            submitBtn.setOpacity(0);
        }
    }

    public void btn1(ActionEvent e){
        label.setText("36+12=");
        answerTextField.setOpacity(1);
        submitBtn.setOpacity(1);
        correctAnswer = 48;

        ARlabel.setOpacity(1);
        ARlabel.setText("Σκανάρετε την εικόνα με το ARTutor για βίντεο με την πρόσθεση");
        helpImage.setOpacity(1);
        Image image = new Image("123.jpg");
        helpImage.setImage(image);
    }

    public void btn2(ActionEvent e){
        messageLabel.setOpacity(0);
        answerTextField.clear();
        label.setText("75-49=");
        answerTextField.setOpacity(1);
        submitBtn.setOpacity(1);
        correctAnswer = 26;
        buttonNum = 2;

        ARlabel.setOpacity(1);
        ARlabel.setText("Σκανάρετε την εικόνα με το ARTutor για βίντεο με την αφαίρεση");
        Image image = new Image("images.jpg");
        helpImage.setOpacity(1);
        helpImage.setImage(image);
    }

    public void btn3(ActionEvent e){
        messageLabel.setOpacity(0);
        answerTextField.clear();
        label.setText("14x8=");
        answerTextField.setOpacity(1);
        submitBtn.setOpacity(1);
        correctAnswer = 112;
        buttonNum = 3;

        ARlabel.setOpacity(1);
        ARlabel.setText("Επιπρόσθετο άρθρο για την πρποπαίδεια");
        Image image = new Image("download.jpg");
        helpImage.setOpacity(1);
        helpImage.setImage(image);
    }

    public void btn4(ActionEvent e){
        messageLabel.setOpacity(0);
        answerTextField.clear();
        label.setText("Η τάξη της κυρίας Σοφίας έχει 13 αγόρια και 12 κορίτσια. Πόσα παιδιά έχει η τάξη της;");
        answerTextField.setOpacity(1);
        submitBtn.setOpacity(1);
        correctAnswer = 25;
        buttonNum = 4;

        ARlabel.setOpacity(1);
        ARlabel.setText("Διαδραστική άσκηση");
        Image image = new Image("askisi.jpg");
        helpImage.setOpacity(1);
        helpImage.setImage(image);
    }

    public void btn5(ActionEvent e){
        messageLabel.setOpacity(0);
        answerTextField.clear();
        label.setText("Η Άννα αγόρασε ένα βιβλίο που έκανε 27 ευρώ. Έδωσε 30 ευρώ. Πόσα ρέστα πήρε;");
        answerTextField.setOpacity(1);
        submitBtn.setOpacity(1);
        correctAnswer = 3;
        buttonNum = 5;
    }


}
