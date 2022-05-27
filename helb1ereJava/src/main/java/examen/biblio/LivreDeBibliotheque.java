package examen.biblio;

import java.time.LocalDate;

public abstract class LivreDeBibliotheque extends Livre {

    private String numeroDeLocalisation;

    protected String statut = "disponible"; // emprunté, disponible, fix


    public LivreDeBibliotheque(String auteur, String titre, String isbn, String numeroDeLocalisation) {
        super(auteur, titre, isbn);
        this.numeroDeLocalisation = numeroDeLocalisation;
    }

    public String getNumeroDeLocalisation() {
        return numeroDeLocalisation;
    }

    public abstract String statut();

    public void retourner() {
        this.statut = "disponible";
    }

    public void emprunter(String numeroDeClient, LocalDate dateDeRetour) {
        this.statut = "emprunter";
    }

    @Override
    public int compareTo(Livre toCompare) {
        if (!(toCompare instanceof LivreDeBibliotheque)) {
            return -1;
        }
        return this.getNumeroDeLocalisation().compareTo(((LivreDeBibliotheque)toCompare).numeroDeLocalisation);
    }

    @Override
    public String toString() {
        return "Titre:  "+getTitre()+"\n" +
                "*****\n" +
                "\tAuteur:\t\t"+getAuteur()+"\n" +
                "\t------\n" +
                "\tISBN:\t\t"+getIsbn()+"\n" +
                "\t----\n" +
                "\tStatut: \t"+statut()+"\n" +
                "\t------\n" +
                "\tLocalisation:\t"+getNumeroDeLocalisation()+"\n" +
                "\t------------";
    }
}
