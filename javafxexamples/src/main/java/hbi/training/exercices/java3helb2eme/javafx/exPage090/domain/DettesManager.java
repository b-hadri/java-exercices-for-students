package hbi.training.exercices.java3helb2eme.javafx.exPage090.domain;

import java.util.ArrayList;
import java.util.List;

public class DettesManager {

    private List<Dette> lesDettes = new ArrayList<>();
    // init. à partir d'un fichier
    // init. à partir d'une BD

    public void ajouterUneDette(Dette dette) {
//        if (dette.getMontant() < 0) {
//            throw new RuntimeException("Le montant doit etre positif");
//        }
        this.lesDettes.add(dette);
    }

    public void supprimerUneDette(Dette dette) {
        this.lesDettes.remove(dette);
    }

    public List<Dette> toutesLesDettes() {
        return this.lesDettes;
    }

    public Double totalDesDettes() {
        Double total = 0.0;
        for (Dette dette : this.lesDettes) {
            total += dette.getMontant();
        }
        return total;
    }

}
