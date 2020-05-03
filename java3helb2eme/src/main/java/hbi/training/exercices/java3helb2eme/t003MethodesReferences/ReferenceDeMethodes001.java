package hbi.training.exercices.java3helb2eme.t003MethodesReferences;

public class ReferenceDeMethodes001 {

    public static void main(String[] args) {

        // methodeStatique();

        // ***************************************
        // instance de méthode



    }




    private static void methodeStatique() {
        // ***************************************
        // méthode STATIQUE

        // classe anonyme interne
        new Thread(new Runnable() {
            @Override
            public void run() {
                monProcessus();
            }
        }).start();

        // lambda
        new Thread(() -> monProcessus()).start();

        // référence de méthode
        new Thread(ReferenceDeMethodes001::monProcessus).start();
    }

    public static void monProcessus() {
        System.out.println("--- executé par "+Thread.currentThread().getName());
    }

}
