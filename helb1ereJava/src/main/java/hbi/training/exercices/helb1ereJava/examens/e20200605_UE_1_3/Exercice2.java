package hbi.training.exercices.helb1ereJava.examens.e20200605_UE_1_3;

public class Exercice2 {

    public static void main(String[] args) {

        /*

        EXAMEN: 2020 06 05 UE 1.3 - examen programmation Examen Caracteres - Exercice 2
        --------------------------

        Vous ne pouvez pas créer de fonctions supplémentaires autre que celles demandées.

        Uniquement:
        - charAt
        - indexOf
        - length
        - substring

        ne pas utiliser de Tableau !

         */


        // Exemple 1
//        String chaine = "[racine]du contenu [adresse]23 rue des ciseaux[esserda] une plante [enicar]";
//        extraireContenu(chaine);

        // Exemple 2
//        String chaine = "[racine]du contenu adresse]23 rue des ciseaux[esserda] une plante [enicar]";
//        extraireContenu(chaine);

        // Exemple 3
//        String chaine = "[racine]du contenu [adresse]23 rue [cle]des[elc] ciseaux[esserda] une plante [enicar]";
//        extraireContenu(chaine);

        // Exemple 4
        String chaine = "Une petite histoire sans motif";
        extraireContenu(chaine);

    }

    public static void extraireContenu(String chaine) {
        System.out.println("La chaine de départ :");
        System.out.println("-------------------");
        System.out.println(chaine + "\n");

        if (!verifier(chaine)) {
            System.out.println("La chaine présente une ou plusieurs incohérences de crochets !!\nExtraction annulée !");
            return;
        }

        System.out.println("Extraction de la chaine de départ :");
        System.out.println("---------------------------------");


        System.out.println("Niveau 0 :\tpas de motif\t=> " + chaine);

        boolean continuerAChercher = true;
        int niveau = 1;
        while (continuerAChercher) {
            String motifTrouvé = trouverMotif(chaine);
            if (motifTrouvé == "") {
                continuerAChercher = false;
            } else {
                chaine = extraireEntreMotif(chaine, motifTrouvé);
                System.out.println("Niveau " + niveau + " :\tmotif = [" + motifTrouvé + "]\t=> " + chaine);
            }
            niveau++;
        }

    }

    public static boolean verifier(String chaine) {

        boolean estValide = true;
        char leCrochetTrouve = ' ';

        for (int i = 0; i < chaine.length(); i++) {
            char caractereCourant = chaine.charAt(i);

            if (caractereCourant == '[') {
                if (leCrochetTrouve != ' ' && leCrochetTrouve != ']') {
                    estValide = false;
                }
                leCrochetTrouve = caractereCourant;
            } else if (caractereCourant == ']') {
                if (leCrochetTrouve != '[') {
                    estValide = false;
                }
                leCrochetTrouve = caractereCourant;
            }
        }

        if (leCrochetTrouve != ' ' && leCrochetTrouve != ']') {
            estValide = false;
        }

        return estValide;
    }

    public static int trouverMotifDebut(String chaine, String clé) {
        int indexMotif = chaine.indexOf("[" + clé + "]");

        if (indexMotif != -1) {
            indexMotif += clé.length() + 2;
        }

        return indexMotif;
    }

    public static int trouverMotifFin(String chaine, String clé) {
        String cleAChercherInversee = "";

        // inverser
        for (int i = clé.length() - 1; i >= 0; i--) {
            cleAChercherInversee += clé.charAt(i);
        }

        return chaine.indexOf("[" + cleAChercherInversee + "]");
    }

    public static String extraireEntreMotif(String chaine, String clé) {
        int indexDebut = trouverMotifDebut(chaine, clé);
        int indexFin = trouverMotifFin(chaine, clé);

        String sousChaine = "";

        if (indexDebut != -1) {
            sousChaine = chaine.substring(indexDebut, indexFin);
        }

        return sousChaine;
    }

    public static String trouverMotif(String chaine) {
        int indexDebut = chaine.indexOf('[');

        if (indexDebut == -1) {
            return "";
        }

        int indexFin = chaine.substring(indexDebut).indexOf(']') + indexDebut;

        return chaine.substring(indexDebut + 1, indexFin);
    }

}

