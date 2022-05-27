package examen.biblio;

public abstract class Livre implements IComparable<Livre>{

    private String auteur;
    private String titre;
    private String isbn;

    public Livre() {
    }

    public Livre(String auteur, String titre, String isbn) {
        this.auteur = auteur;
        this.titre = titre;
        this.isbn = isbn;
    }

    @Override
    public int compareTo(Livre toCompare) {
        int result = 0;
        return 0;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
