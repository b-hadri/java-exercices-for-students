package hbi.training.exercices.java3helb2eme.javafx.exPage090.domain;

public class DetteManagerTest {

    public static void main(String[] args) {

        DettesManager dettesManager = new DettesManager();

        dettesManager.ajouterUneDette(new Dette("Adam", 300.0));
        dettesManager.ajouterUneDette(new Dette("Saleh", 900.0));
        dettesManager.ajouterUneDette(new Dette("John", 800.0));


        // le total doit etre egale à 2000.0
        if (dettesManager.totalDesDettes() == 2000.0) {
            System.out.println("SUPER, cela fonctionne ! hmd");
        } else {
            System.err.println("ERROR, les montants sont erronés: "+ dettesManager.totalDesDettes());
        }

    }

}
