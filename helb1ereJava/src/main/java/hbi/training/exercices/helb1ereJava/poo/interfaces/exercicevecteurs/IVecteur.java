package hbi.training.exercices.helb1ereJava.poo.interfaces.exercicevecteurs;

public interface IVecteur {

    public int getTailleVecteur();

    public void affecterUneValeur(int x, int index);

    public int accederALaValeur(int index);

    public void affecterAvecLaMemeValeur(int d);

    public int produitScalaireAvec(IVecteur v2);

}
