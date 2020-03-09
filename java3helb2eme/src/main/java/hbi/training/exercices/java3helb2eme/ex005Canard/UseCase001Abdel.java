package hbi.training.exercices.java3helb2eme.ex005Canard;

public class UseCase001Abdel {


    public static void main(String[] args) {


        // créer un Colvert ou un Fuligule
        Canard canardColvert = FabriqueCanard.create("FULIGULE");
//        Canard canardColvert = FabriqueCanard.create("COLVERT");

        // voler 10 j.
        canardColvert.voler(10);

        // se blesse
        canardColvert.seBlesse();

        // fait un cancan
        canardColvert.cancanne();

        // il guérit
        canardColvert.guerit();

        // fait un cancan
        canardColvert.cancanne();


    }


}
