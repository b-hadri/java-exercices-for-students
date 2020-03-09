package hbi.training.exercices.java3helb2eme.ex005Canard.lescanards;

public class Colvert  extends Canard {


    public Colvert(boolean blesse) {
        super(blesse, "CANCAN_COLVERT", "VOL_COLVERT");
        System.out.println("Instanciation d'un Canard de type Colvert");
    }

    @Override
    public void cancanne() {
        if (isBlesse()) {
            System.out.println("Je cancanne comme un Colvert blessé...");
        } else {
            System.out.println("Je cancanne comme un Colvert...");
        }
    }

    @Override
    public void voler(int pendantXJours) {

            if (isBlesse()) {
                System.out.println("Je vole comme un Colvert blessé pendant "+pendantXJours+" jour...");
            } else {
                System.out.println("Je vole comme un Colvert pendant "+pendantXJours+" jour...");

            }

    }
}
