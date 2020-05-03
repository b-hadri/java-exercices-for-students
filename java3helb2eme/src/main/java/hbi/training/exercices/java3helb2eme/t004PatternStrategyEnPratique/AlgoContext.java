package hbi.training.exercices.java3helb2eme.t004PatternStrategyEnPratique;

public class AlgoContext {

    private AlgoStrategy algo;

    public void chooseTheAlgoEnFonctionDuContext() {

        algo = new Algo4(); // récupérer le choix, qui a été fait

    }

    public void executerLAlgo() {
        algo.traitement();
    }

}
