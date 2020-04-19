package hbi.training.exercices.java3helb2eme.javafx.exPage090;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainExP090 extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("ui/Summary.fxml"));
        Parent parent = fxmlLoader.load();

        stage.setScene(new Scene(parent));
        
        stage.show();
    }


}
