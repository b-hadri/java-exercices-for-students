package hbi.training.exercices.java3helb2eme.javafx.exPage090.ui;

import hbi.training.exercices.java3helb2eme.javafx.exPage090.domain.Dette;
import hbi.training.exercices.java3helb2eme.javafx.exPage090.domain.DettesManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class SummaryController {

    private DettesManager dettesManager;

    public Label nomUtilisateur;
    public Label soldeTotalLabel;
    public ScrollPane depensesAreaScrollPane;

    @FXML
    public void initialize() {
        this.dettesManager = new DettesManager();
        this.refreshTotal();
    }

    public void nouvelleDepenseAction(ActionEvent actionEvent) throws IOException {
        Stage addDepenseStage = new Stage();

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("AddDette.fxml"));
        Parent parent = fxmlLoader.load();

        AddDetteController controller =
                fxmlLoader.<AddDetteController>getController();
        controller.initDetteManager(dettesManager);

        addDepenseStage.setScene(new Scene(parent));
        addDepenseStage.showAndWait();

        this.refreshTotal();
        this.refreshDepenseRows();
    }

    public void refreshTotal() {
        Double montant = this.dettesManager.totalDesDettes();
        if (montant == 0.0) {
            this.soldeTotalLabel.setText("--- Vous n'avez pas dette. Bravo ! : ) ---");
        } else {
            this.soldeTotalLabel.setText("Vous devez " + montant + " euros. Pensez à rembourser !");
        }
    }

    // ATTENTION, pour le refresh, le meilleur et le plus clean est d'utiliser
    // le design patter Observer/Observable (ex: ObservableList)
    // https://fabrice-bouye.developpez.com/tutoriels/javafx/collection-extractor-javafx/
    private void refreshDepenseRows() throws IOException {
        System.out.println("REFRESH depense Rows");

        VBox vBox = new VBox();
        for (Dette dette : this.dettesManager.toutesLesDettes()) {
            vBox.getChildren().add(getRow(dette));
        }

        this.depensesAreaScrollPane.setContent(vBox);
    }

    private Parent getRow(Dette dette) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("RowDette.fxml"));
        Parent parent = fxmlLoader.load();

        RowDetteController controller =
                fxmlLoader.<RowDetteController>getController();
        controller.initDetteManager(dette);

        // ATTENTION, pour le refresh, le mieux et le plus clean est d'utiliser
        // le design patter Observer/Observable (ex: ObservableList)
        // https://fabrice-bouye.developpez.com/tutoriels/javafx/collection-extractor-javafx/
        controller.rmvDetteBtn.setOnAction(event -> {
            this.dettesManager.supprimerUneDette(dette);
            try {
                this.refreshTotal();
                this.refreshDepenseRows();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        return parent;
    }

}
