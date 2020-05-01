package hbi.training.exercices.java3helb2eme.javafx.exPage090.ui;

import hbi.training.exercices.java3helb2eme.javafx.exPage090.domain.Dette;
import hbi.training.exercices.java3helb2eme.javafx.exPage090.domain.DettesManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RowDetteController {

    public Label detteLbl;
    public Button rmvDetteBtn;

    private Dette Dette;

    @FXML
    public void initialize() {
    }

    public void initDetteManager(Dette dette) {
        this.Dette = Dette;
        this.detteLbl.setText("Vous devez "+dette.getMontant()+" € à "+ dette.getNomCompletDuCreancier());
    }

}
