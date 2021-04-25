package hbi.training.exercices.helb1ereJava.poo.interface2;

public class InscriptionImpl implements IInscription {

    private String id;
    private String nomPersonne;
    private String prenomPersonne;

    public InscriptionImpl(String id, String nomPersonne, String prenomPersonne) {
        this.id = id;
        this.nomPersonne = nomPersonne;
        this.prenomPersonne = prenomPersonne;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getNomPersonne() {
        return this.nomPersonne;
    }

    @Override
    public String getPrenomPersonne() {
        return this.prenomPersonne;
    }
}
