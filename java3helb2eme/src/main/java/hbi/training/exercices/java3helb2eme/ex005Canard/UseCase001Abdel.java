package hbi.training.exercices.java3helb2eme.ex005Canard;

import hbi.training.exercices.java3helb2eme.ex005Canard.lescanards.Canard;

public class UseCase001Abdel {


    public static void main(String[] args) {


        // créer un Colvert ou un Fuligule
//        Canard canard = FabriqueCanard.create("FULIGULE");
        Canard canard = FabriqueCanard.create("COLVERT");

        // voler 10 j.
        canard.voler(10);

        // se blesse
        canard.seBlesse();

        // fait un cancan
        canard.cancanne();

        // il guérit
        canard.guerit();

        // fait un cancan
        canard.cancanne();


    }


}
