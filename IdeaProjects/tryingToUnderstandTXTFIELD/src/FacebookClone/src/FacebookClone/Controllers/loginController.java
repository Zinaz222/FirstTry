package FacebookClone.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class loginController implements Initializable {

    public TextField Robotone;

    @FXML
    private ComboBox comboPictures;

    @FXML
    private TextField textname ;

    @FXML
    private Button okButton ;


        //method changes the scene to mainmenu when logging in
    public void changeScreen(ActionEvent event) throws IOException{

        Parent homeScreenParent = FXMLLoader.load(getClass().getResource("/FacebookClone/FXML/home.fxml"));
        Scene homeScreenScene = new Scene(homeScreenParent);

        //this line gets the Stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(homeScreenScene);
        window.setTitle("Home");
        window.show();
    }


    //this is how the user is defined
    public void SetNameRobot(MouseEvent mouseEvent) throws IOException {
        String yo = textname.getText();
        Robotone.setText(yo);



    }

    //this is how we initialize the combobox
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboPictures.getItems().removeAll(comboPictures.getItems());
        comboPictures.getItems().addAll("Option 1", "Option 2", "Option 3", "Option 4", "Option 5");

        comboPictures.getSelectionModel().select("Option 1");
    }


}
