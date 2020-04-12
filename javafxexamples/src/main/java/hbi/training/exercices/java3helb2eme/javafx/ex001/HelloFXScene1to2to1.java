package hbi.training.exercices.java3helb2eme.javafx.ex001;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class  HelloFXScene1to2to1 extends Application {

    Stage stage;
    Scene scene1;
    Scene scene2;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;

        initStage();
        initScene1();
        initScene2();

        this.stage.setScene(this.scene1);

        this.stage.show();
    }

    private void initStage() {
        stage.setTitle("Scene 1 / Scene 2");
        stage.setHeight(400);
        stage.setWidth(400);
    }

    private void initScene1() {
        Button btn = new Button("To Scene 2");
        btn.setOnAction(e -> stage.setScene(scene2));

        StackPane layout1 = new StackPane();
        layout1.getChildren().add(btn);
        scene1 = new Scene(layout1);
    }

    private void initScene2() {
        Button btn = new Button("To Scene 1");
        btn.setOnAction(e -> stage.setScene(scene1));

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(btn);
        scene2 = new Scene(layout2);
    }
}
