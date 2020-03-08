package hbi.training.exercices.java3helb2eme.ex005Canard;

public class Colvert  extends Canard {


    public Colvert(boolean blesse) {
        super(blesse, "CANCAN_COLVERT", "VOL_COLVERT");
    }

    @Override
    public void cancanner() {
        if (isBlesse()) {
            System.out.println("Je cancanne comme un Colvert blessé...");
        } else {
            System.out.println("Je cancanne comme un Colvert...");
        }
    }

    @Override
    public void voler(int pendantXJours) {
        for (int i = 0; i < pendantXJours; i++) {
            if (isBlesse()) {
                System.out.println("Je vole comme un Colvert blessé pendant 1 jour...");
            } else {
                System.out.println("Je vole comme un Colvert pendant 1 jour...");

            }
        }
    }
}
