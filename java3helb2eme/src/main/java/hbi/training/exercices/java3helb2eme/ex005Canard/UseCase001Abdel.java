package hbi.training.exercices.java3helb2eme.ex005Canard;

public class UseCase001Abdel {


    public static void main(String[] args) {


        // créer un Colvert
        Canard canardColvert = FabriqueCanard.createCanard("COLVERT");

        canardColvert.seBlesser();

        // voler 10 j.
        canardColvert.voler(10);

        // se blesse
        canardColvert.seBlesser();
            // cancan modifié
            // vol aussi

        // fait un cancan
        canardColvert.cancanner();


        // il guérit
        canardColvert.seGuerir();

        // fait un cancan
        canardColvert.cancanner();


    }


}
