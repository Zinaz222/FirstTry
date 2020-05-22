package FacebookClone.Controllers;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class homeController implements Initializable {

    public TextField Robottwo;


    @FXML private TextArea friendstextarea;
    @FXML private ListView listview;


    //this function allows us to change screens if we press leave network
    public void changeScreen(ActionEvent event) throws IOException {

        Parent homeScreenParent = FXMLLoader.load(getClass().getResource("/FacebookClone/FXML/login.fxml"));
        Scene homeScreenScene = new Scene(homeScreenParent);

        //this line gets the Stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(homeScreenScene);
        window.show();




    }

    public void yoyoyo(MouseEvent mouseEvent) {
        Robottwo.setText("Sinbad");
    }

    //this function adds friends
    public void addfriend(ActionEvent event) {

        String textareaString = "";

        ObservableList listofItems = listview.getSelectionModel().getSelectedItems();

        for(Object item : listofItems){
            textareaString += String.format("%s%n", (String) item);
        }

        this.friendstextarea.setText(textareaString);

    }

    //this function deletes the friends
    public void deletefriend(ActionEvent event) {

        String textareaString = "";

        ObservableList listofItems = listview.getSelectionModel().getSelectedItems();

        for(Object item : listofItems){
            textareaString += String.format("%s%n", (String) item);
        }

        this.friendstextarea.setText("");


    }
    @Override
    public void initialize(URL url, ResourceBundle rb){

        //configure friends listarea
        listview.getItems().addAll("Naruto", "Luffy", "Shoyo", "Mihawk");
        listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


    }


}
