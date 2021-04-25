package hbi.training.exercices.helb1ereJava.poo.interface2.dbimplementation;

import hbi.training.exercices.helb1ereJava.poo.interface2.IBaseDeDonnees;
import hbi.training.exercices.helb1ereJava.poo.interface2.IInscription;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BaseDeDonneesInMemory implements IBaseDeDonnees {

    List<IInscription> inscriptions = new ArrayList<>();

    @Override
    public void sauver(IInscription inscription) {
        if (inscriptions.contains(inscription)) {
            inscriptions.remove(inscription);
        }
        inscriptions.add(inscription);
    }

    @Override
    public void ajouter(IInscription inscription) {
        this.sauver(inscription);
    }

    @Override
    public void supprimer(String id) {
        IInscription inscriptionASupprimer = getInscriptionFromId(id);
        if (inscriptionASupprimer != null) {
            this.inscriptions.remove(inscriptionASupprimer);
        }
    }

    @Override
    public void modifier(IInscription inscription) {
        this.sauver(inscription);
    }

    @Override
    public int nombreInscrits() {
        return this.inscriptions.size();
    }

    private IInscription getInscriptionFromId(String id) {
        IInscription inscriptionTrouvee = null;
        for (int i = 0; i < this.inscriptions.size(); i++) {
            if (inscriptions.get(i).getId() == id) {
                inscriptionTrouvee = inscriptions.get(i);
            }
        }
        return inscriptionTrouvee;
    }


}
