package hbi.training.exercices.java3helb2eme.javafx.exFxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainExampleFxml extends Application {

    Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;

//        Pane mainPane = new Pane();
//        mainPane.getChildren().setAll(FXMLLoader.lo);

//        Pane mainPane = (Pane) FXMLLoader
//                .load(getClass().getResource("hbi/training/exercices/java3helb2eme/javafx/exP090/FormDepense.fxml"));

//        Pane mainPane = (Pane) FXMLLoader
//                .load(getClass().getClassLoader().getResource("FormDepense.fxml"));

        // ---

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("FormDepense.fxml"));
        Pane mainPane = (Pane) fxmlLoader.load();


        this.stage.setScene(new Scene(mainPane));

        this.stage.show();
    }

}
