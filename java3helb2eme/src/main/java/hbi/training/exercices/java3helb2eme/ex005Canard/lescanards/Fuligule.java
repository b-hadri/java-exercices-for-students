package hbi.training.exercices.java3helb2eme.ex005Canard.lescanards;

public class Fuligule extends Canard {

    public Fuligule(boolean blesse) {
        super(blesse, "CANCAN_FULIGULE", "VOL_FULIGULE");
        System.out.println("Instanciation d'un Canard de type Fuligule");
    }

    @Override
    public void cancanne() {
        if (isBlesse()) {
            System.out.println("Je cancanne comme un Fuligule blessé...");
        } else {
            System.out.println("Je cancanne comme un Fuligule...");
        }
    }

    @Override
    public void voler(int pendantXJours) {
        if(this.isBlesse()) {
            System.out.println("Je vole comme un Fuligule blessé pendant "+pendantXJours+"......");
        } else {
            System.out.println("Je vole comme un Fuligule pendant "+pendantXJours+"......");
        }
    }

    public String donneMoiTonNom() {
        return "Je suis un fuligule";
    }

}
