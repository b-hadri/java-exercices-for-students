package hbi.training.exercices.java3helb2eme.javafx.ex001;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloFX extends Application {

    Stage stage;
    Scene scene;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;

        initStage();
        initScene();

        this.stage.setScene(this.scene);

        this.stage.show();
    }

    private void initStage() {
        stage.setTitle("VBox");
        stage.setHeight(400);
        stage.setWidth(400);
    }

    private void initScene() {
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        TextField textField = new TextField("Text field");
        CheckBox checkBox = new CheckBox(("Checkbox"));
        RadioButton radioButton = new RadioButton("Radio button");

        VBox layout = new VBox(20);
        layout.getChildren().addAll(btn1, btn2, textField, checkBox, radioButton);
        scene = new Scene(layout, 1300, 800);
    }

}
