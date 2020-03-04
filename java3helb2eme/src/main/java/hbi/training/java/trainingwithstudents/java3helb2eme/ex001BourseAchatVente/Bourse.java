package hbi.training.java.trainingwithstudents.java3helb2eme.ex001BourseAchatVente;

import java.text.DecimalFormat;

/**
 * @Author Bilal HADRI
 * @Date : 04/03/2020, Wednesday, 04 March 2020
 */
public class Bourse {

    static DecimalFormat dec = new DecimalFormat("#0.0000000");

    public static void main(String[] args) {

        for (int heure = 0; heure < 24; heure++) {
            double prevision = prevision(heure);
            System.out.println("Heure:\t"+heure+"\tprevision:\t"+ dec.format(prevision));
        }

    }

    private static double prevision (double x) {

        double y = auCarre( 0.5 * x - 10);
        y = auCarre(y - 1);
        y = auCarreMoins(y + 1);
        y = (y + 2) * 10;

        return y;
    }

    public static double auCarre(double x) {
        return Math.pow(2, x);
    }
    public static double auCarreMoins(double x) {
        return 1 / Math.pow(2, x);
    }

}
