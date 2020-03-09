package hbi.training.exercices.java3helb2eme.ex005Canard;

import hbi.training.exercices.java3helb2eme.ex005Canard.lescanards.Canard;
import hbi.training.exercices.java3helb2eme.ex005Canard.lescanards.Colvert;
import hbi.training.exercices.java3helb2eme.ex005Canard.lescanards.Fuligule;

public abstract class FabriqueCanard {

    public static Canard create(String typeDeCanard) {
        Canard canard = null;

        switch (typeDeCanard.toUpperCase()) {
            case "COLVERT":
                canard = new Colvert(false);
                break;

            case "FULIGULE":
                canard = new Fuligule(false);
                break;

            default:
                throw new RuntimeException("Type de canard non trouvé ("+typeDeCanard+")");
        }

        return canard;
    }

}
