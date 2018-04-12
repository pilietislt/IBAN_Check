package controllers;

import alerts.Alert;
import back_end.Services;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.iban4j.IbanFormatException;
import org.iban4j.IbanUtil;
import org.iban4j.InvalidCheckDigitException;
import org.iban4j.UnsupportedCountryException;
import utils.IOUtils;

import java.io.File;

import java.util.List;


public class Controller {

    @FXML
    private TextField ibanText;

    @FXML
    private Label result;

    @FXML
    private Pane firstPane;


    public void ibanCheck() {

        if (ibanText.getText().trim().isEmpty()) {
            result.setTextFill(Color.BLACK);
            result.setText("Please first fill text field");
        } else {
            try {

                IbanUtil.validate(ibanText.getText());
                result.setTextFill(Color.GREEN);
                result.setText("TRUE");

            } catch (IbanFormatException |
                    InvalidCheckDigitException |
                    UnsupportedCountryException e) {

                result.setTextFill(Color.RED);
                result.setText("FALSE");
                //e.printStackTrace();
            }
        }


    }

    public void handelOpenButton() {


        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("TEXT FILES", "txt", "text");
        fileChooser.setSelectedExtensionFilter(filter);
        fileChooser.setTitle("Select file");
        Stage stage = (Stage) firstPane.getScene().getWindow();

        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text Files", "*.txt"));

        File file = fileChooser.showOpenDialog(stage);
        if (file == null) {
            new Alert().informationAlert("IBAN check", "Please select text file");
        }else {

            List<String> list = IOUtils.readFile(file);

            IOUtils.writeToFile(Services.stringCheck(list), file.getPath() + ".out");
            new Alert().informationAlert("IBAN check", file.getPath() + ".out successfully created");
        }
    }



}
