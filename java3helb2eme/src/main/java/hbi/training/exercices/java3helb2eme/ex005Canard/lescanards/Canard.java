package hbi.training.exercices.java3helb2eme.ex005Canard.lescanards;

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

    abstract public void cancanne();

    abstract public void vole(int pendantXJours);



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


    public void seBlesse() {
        this.blesse = true;
        System.out.println("Je me blesse");
    }


    public void guerit() {
        this.blesse = false;
        System.out.println("Je guéris");
    }
}
