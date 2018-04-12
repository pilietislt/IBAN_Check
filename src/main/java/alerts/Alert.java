package alerts;

import javafx.scene.control.ButtonType;

public class Alert {

    public void informationAlert(String title, String contentText){
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(contentText);
        alert.showAndWait().ifPresent(rs -> {
            if (rs == ButtonType.OK) {

            }
        });

    }

}


