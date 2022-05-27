package maps;

import java.time.LocalDateTime;

public class Etudiant implements Comparable<Etudiant> {

    private Integer id;
    private String nom;
    private String prenom;
    private LocalDateTime dateArrivee;

    public Etudiant(Integer id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateArrivee = LocalDateTime.now();
    }

    public Integer getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDateTime getDateArrivee() {
        return dateArrivee;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public int compareTo(Etudiant o) {
        return this.id.compareTo((o.id));
    }
}
