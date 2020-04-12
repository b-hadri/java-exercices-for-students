package hbi.training.exercices.java3helb2eme.javafx.ex001;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelloFXTests extends Application {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("First window in JavaFx : )");
        primaryStage.setHeight(700);
        primaryStage.setWidth(1024);
        primaryStage.show();
        primaryStage.centerOnScreen();


//        stage.setTitle("Hello World...");
//
//        button = new Button();
//        button.setText("Click me!");
//        button.setOnAction(actionEvent -> {
//
//        });
//
//        StackPane layout = new StackPane();
//        layout.getChildren().add(button);
//
//        Scene scene = new Scene(layout, 600, 250);
//        stage.setScene(scene);
//        stage.show();

    }
}
