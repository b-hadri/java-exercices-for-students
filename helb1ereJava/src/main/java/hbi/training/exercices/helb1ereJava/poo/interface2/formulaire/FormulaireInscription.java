package hbi.training.exercices.helb1ereJava.poo.interface2.formulaire;

import hbi.training.exercices.helb1ereJava.poo.interface2.IBaseDeDonnees;
import hbi.training.exercices.helb1ereJava.poo.interface2.IInscription;

public class FormulaireInscription {

    private IInscription inscription;
    private IBaseDeDonnees baseDeDonnees;

    public FormulaireInscription(IInscription inscription, IBaseDeDonnees baseDeDonnees) {
        this.inscription = inscription;
        this.baseDeDonnees = baseDeDonnees;
    }

    public boolean validerLeFormulaire() {
        if (inscription.getNomPersonne() == null || inscription.getNomPersonne().length() == 0) {
            return false;
        }
        return true;
    }

    public boolean sauverInscription() {
        if (validerLeFormulaire()) {
            this.baseDeDonnees.sauver(this.inscription);
            return true;
        }
        return false;
    }

}
