package hbi.training.exercices.java3helb2eme.ex005Canard;

public class Fuligule extends Canard {

    public Fuligule(boolean blesse) {
        super(blesse, "CANCAN_FULIGULE", "VOL_FULIGULE");
    }

    @Override
    public void cancanner() {
        System.out.println("Je cancanne comme un Fuligule...");
    }

    @Override
    public void voler(int pendantXJours) {
        System.out.println("Je vole comme un Fuligule......");
    }

    public String donneMoiTonNom() {
        return "Je suis un fuligule";
    }

}
