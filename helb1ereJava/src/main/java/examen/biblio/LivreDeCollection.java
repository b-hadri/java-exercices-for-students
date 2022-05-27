package examen.biblio;

public class LivreDeCollection extends LivreDeBibliotheque {

    private String collection;

    public LivreDeCollection(String auteur, String titre, String isbn, String numeroDeLocalisation, String collection) {
        super(auteur, titre, isbn, numeroDeLocalisation);
        this.statut = "fix";
        this.collection = collection;
    }

    @Override
    public String statut() {
        return "Un livre de collection ne peut pas être emprunté";
    }

    public String getCollection() {
        return collection;
    }
}
