package FacebookClone;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class homeController {

    public void changeScreen(ActionEvent event) throws IOException {

        Parent homeScreenParent = FXMLLoader.load(getClass().getResource("/FacebookClone/sample.fxml"));
        Scene homeScreenScene = new Scene(homeScreenParent);

        //this line gets the Stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(homeScreenScene);
        window.show();


    }

}
