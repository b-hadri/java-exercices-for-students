package hbi.training.exercices.java3helb2eme.ex001BourseAchatVente;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author Bilal HADRI
 * @Date : 04/03/2020, Wednesday, 04 March 2020
 */
public class PrevisionEvaluator {

    static DecimalFormat dec = new DecimalFormat("#0.0000000");

    List<Prevision> previsionList = new ArrayList<>();


    public void afficherLaMeilleurePrevisionEtLaPlusMauvaise() {

        this.calculerLesPrevisionsParHeure();

        Prevision meilleurePrevision = previsionList.get(0);
        Prevision mauvaisePrevision = previsionList.get(previsionList.size() - 1);

        System.out.println("Alex, stp, achète à "+meilleurePrevision.getHeure()+ "h parce que l'action est à "+meilleurePrevision.getPrixAction());
        System.out.println("et vends à "+mauvaisePrevision.getHeure()+ "h parce que l'action est à "+mauvaisePrevision.getPrixAction());

    }

    private void calculerLesPrevisionsParHeure() {

        previsionList = new ArrayList<>();

        for (int heure = 0; heure < 24; heure++) {
            previsionList.add(new Prevision(heure, prevision(heure)));
        }

        previsionList.sort(Prevision::compareTo);
    }

    private double prevision (double x) {

        double y = puiss2( 0.5 * x - 10);
        y = puiss2(y - 1);
        y = puissMoins2(y + 1);
        y = (y + 2) * 10;

        return y;
    }

    private double puiss2(double x) {
        return Math.pow(2, x);
    }
    private double puissMoins2(double x) {
        return 1 / Math.pow(2, x);
    }

}
