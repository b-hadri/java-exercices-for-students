package hbi.training.exercices.helb1ereJava.esiExamenJanvier;

public class MotDePasse {

    final String CARACTERES_SPECIAUX = "@!?$&∗";
    final String [] historiqueMdp = new String[10];

    public static void main(String[] args) {

    }

    boolean estUnCaractereSpecial(char caractere) {
        return CARACTERES_SPECIAUX.contains(Character.toString(caractere));
    }

    int rechercherMdpHistorique(String mdp, String[] historiqueMdp) {
        int indiceTrouve = -1;

        for (int i = 0; i < historiqueMdp.length; i++) {
            if (mdp.equals(historiqueMdp[i])) {
                indiceTrouve = i;
                break;
            }
        }
        historiqueMdp[0] = "fef"; // incomplet
        return indiceTrouve;
    }

}
