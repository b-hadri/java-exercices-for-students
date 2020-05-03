package hbi.training.exercices.java3helb2eme.t004PatternStrategy;

public class LAlgoAExecuter {

    

    public void executer(int typeAlgo) {

        switch (typeAlgo) {
            case 1:
                new Algo1().executer();
                break;
            case 2:
                new Algo2().executer();
                break;
            case 3:
                new Algo3().executer();
                break;
            default:
                new Algo1().executer();
        }

    }

}
