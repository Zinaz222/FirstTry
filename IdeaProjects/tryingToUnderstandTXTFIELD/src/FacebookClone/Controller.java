package FacebookClone;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;



public class Controller implements Initializable {


    public TextField textname;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        
    }

    public void getName() {

        String name = textname.textProperty().get();

        System.out.println(name);

    }

    //method changes the scene to main menu
    public void changeScreen(ActionEvent event) throws IOException{

        Parent homeScreenParent = FXMLLoader.load(getClass().getResource("/FacebookClone/main.fxml"));
        Scene homeScreenScene = new Scene(homeScreenParent);

        //this line gets the Stage info
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(homeScreenScene);
        window.show();


    }


//    public void openHome(){
//
//        try{
//
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FacebookClone/main.fxml"));
//            Parent root = loader.load();
//
//            Main.getHomeStage().setScene(new Scene(root));
//
//            Main.getHomeStage().show();
//
//
//        }catch (IOException ex){
//
//            System.out.println(ex);
//        }
//
//    }


//    public void LogintoHome(MouseEvent mouseEvent) {
//
//        Button button = (Button) mouseEvent.getSource();
//        String buttonteez = button.getText();
//
//        switch(buttonteez){
//            case "Log":
//                getName();
//                openHome();
//                break;
//
//        }
//
//    }
}
