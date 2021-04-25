package hbi.training.exercices.helb1ereJava.poo.interface2.dbimplementation;

import hbi.training.exercices.helb1ereJava.poo.interface2.IBaseDeDonnees;
import hbi.training.exercices.helb1ereJava.poo.interface2.IInscription;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDonneesRapide implements IBaseDeDonnees {

    IInscription [] inscriptions = new IInscription[1000];

    @Override
    public void sauver(IInscription inscription) {
        //...
    }

    @Override
    public void ajouter(IInscription inscription) {

    }

    @Override
    public void supprimer(String id) {

    }

    @Override
    public void modifier(IInscription inscription) {

    }

    @Override
    public int nombreInscrits() {
        return 0;
    }
}
