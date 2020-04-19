package hbi.training.exercices.java3helb2eme.javafx.exPage090.ui;

import hbi.training.exercices.java3helb2eme.javafx.exPage090.domain.Dette;
import hbi.training.exercices.java3helb2eme.javafx.exPage090.domain.DettesManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddDepenseController {

    private DettesManager dettesManager;

    public TextField creancierTf;
    public TextField montantTf;
    public Label messageErrorLbl;

    @FXML
    public void initialize() {
        this.messageErrorLbl.setText("");
    }

    public void initDetteManager(DettesManager dettesManager) {
        this.dettesManager = dettesManager;
    }

    public void ajouterUneDette(ActionEvent actionEvent) {
        try {

            String creancier = this.creancierTf.getText();
            Double montant = Double.valueOf(this.montantTf.getText());

            this.dettesManager.ajouterUneDette(new Dette(creancier, montant));

            Stage stage = (Stage) this.creancierTf.getScene().getWindow();
            stage.close();

        }catch (Exception e) {

            this.messageErrorLbl.setText(e.getMessage());

        }

    }
}
