package hbi.training.exercices.java3helb2eme.ex005Canard;

import hbi.training.exercices.java3helb2eme.ex005Canard.lescanards.Colvert;
import hbi.training.exercices.java3helb2eme.ex005Canard.lescanards.Fuligule;

public abstract class FabriqueCanard {

    public static Canard create(String typeCanard) {
        if (typeCanard.equals("COLVERT")) {
            return new Colvert(false);
        } else {
            return new Fuligule(false);
        }
    }

}
