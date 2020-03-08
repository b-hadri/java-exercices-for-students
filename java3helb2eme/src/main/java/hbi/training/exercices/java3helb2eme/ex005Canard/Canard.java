package hbi.training.exercices.java3helb2eme.ex005Canard;

public abstract class Canard {

    private boolean blesse;
    private String cancanType;
    private String volType;

    public Canard(boolean blesse, String cancanType, String volType) {
        this.blesse = blesse;
        this.cancanType = cancanType;
        this.volType = volType;
    }

    public void flotter() {
        System.out.println("Je flotte...");
    }

    abstract public void cancanner();

    abstract public void voler(int pendantXJours);



    public boolean isBlesse() {
        return blesse;
    }

    public String getCancanType() {
        return cancanType;
    }
    public String getVolType() {
        return volType;
    }

    public void setVolType(String volType) {
        this.volType = volType;
    }


    public void seBlesser() {
        this.blesse = true;
    }


    public void seGuerir() {
        this.blesse = false;
    }
}
