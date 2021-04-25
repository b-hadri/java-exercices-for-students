package hbi.training.exercices.helb1ereJava.poo.interfaces.exercicevecteurs;

public class Tableau implements IVecteur {

    private int taille;
    private int [] elements;

    public Tableau(int taille) {
        this.taille = taille;
        this.elements = new int[taille];
    }


    @Override
    public int getTailleVecteur() {
        return this.taille;
    }

    @Override
    public void affecterUneValeur(int x, int index) {
        this.elements[index] = x;
    }

    @Override
    public int accederALaValeur(int index) {
        return this.elements[index];
    }

    @Override
    public void affecterLaMemeValeurATousLesElements(int d) {
        for (int i = 0; i < this.elements.length; i++) {
            this.elements[i] = d;
        }
    }

    @Override
    public int produitScalaireAvec(IVecteur v2) {
        if (this.taille != v2.getTailleVecteur()) {
            throw new IllegalArgumentException("Les vecteurs doivent avoir la même taille");
        }

        int produitScalaire = 0;
        for (int i = 0; i < this.taille; i++) {
            produitScalaire += this.elements[i] * v2.accederALaValeur(i);
        }

        return produitScalaire;
    }
}
