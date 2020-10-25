package hbi.training.exercices.helb1ereJava.td03;

public class Exercice205V1TriangleDe {

    public static void main(String[] args) {

        // a * b + c = d

        long a; // boucle for
        long b; // Le deuxième membre est obtenu par calcul
        int c;
        long d = 9;

        for (int i = 1; i <= 9; i++) {
            c = i;
            a = calculerA(i);
            b = calculerB(a, c, d);

            String espace = espaceAvantLeCalculePour(9 - i);
            System.out.println(espace + a + " * " + b + " + " + c + " = " + d);

            d = calculerLeDSuivant(d);
        }
    }

    // boucle for
    static long calculerA(long a) {
        String aText = "";
        for (int i = 1; i <= a; i++) {
            aText += i;
        }
        return Long.valueOf(aText);
    }

    static long calculerB(long a, long c, long d) {
        return (d - c) / a;
    }

    private static long calculerLeDSuivant(long d) {
        return Long.valueOf(d + "" + ((d % 10) - 1));
    }

    private static String espaceAvantLeCalculePour(int index) {
        String espace = "";
        for (int i = 0; i < index; i++) {
            espace += " ";
        }
        return espace;
    }


}
