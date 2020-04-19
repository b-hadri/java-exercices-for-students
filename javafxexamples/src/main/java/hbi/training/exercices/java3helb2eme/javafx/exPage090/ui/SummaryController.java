package hbi.training.exercices.java3helb2eme.javafx.exPage090.ui;

import hbi.training.exercices.java3helb2eme.javafx.exPage090.domain.DettesManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SummaryController {

    public Label nomUtilisateur;

    private DettesManager dettesManager;

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
        fxmlLoader.setLocation(getClass().getResource("AddDepense.fxml"));
        Parent parent = fxmlLoader.load();

        AddDepenseController controller =
                fxmlLoader.<AddDepenseController>getController();
        controller.initDetteManager(dettesManager);

        addDepenseStage.setScene(new Scene(parent));
        addDepenseStage.showAndWait();

        this.refreshTotal();
    }

    public void refreshTotal() {
        Double montant = this.dettesManager.totalDesDettes();
        if (montant == 0.0) {
            this.soldeTotalLabel.setText("--- Vous n'avez pas dette. Bravo ! : ) ---");
        } else {
            this.soldeTotalLabel.setText("Vous devez " + montant + " euros. Pensez à rembourser !");
        }
    }

}
