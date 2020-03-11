package hbi.training.exercices.java3helb2eme.ex005Canard;

import hbi.training.exercices.java3helb2eme.ex005Canard.lescanards.Canard;

public class UseCase001Abdel {


    public static void main(String[] args) {

//        Canard canard = FabriqueCanard.create("FULIGULE");
        Canard canard = FabriqueCanard.create("COLVERT");

        canard.vole(10);

        canard.seBlesse();

        canard.cancanne();

        canard.guerit();

        canard.cancanne();

    }


}
