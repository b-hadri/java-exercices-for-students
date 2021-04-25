package hbi.training.exercices.helb1ereJava.poo.interface2;

public interface IBaseDeDonnees {

    public void sauver(IInscription inscription);

    public void ajouter(IInscription inscription);

    public void supprimer(String id);

    public void modifier(IInscription inscription);

    public int nombreInscrits();

}
