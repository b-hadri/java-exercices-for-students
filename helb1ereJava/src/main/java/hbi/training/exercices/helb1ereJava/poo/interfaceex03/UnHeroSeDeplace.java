package hbi.training.exercices.helb1ereJava.poo.interfaceex03;

public class UnHeroSeDeplace {

    public static void main(String[] args) {

        Voiture voiture = new Voiture(0, 0, 25);
        Ascenseur ascenseur = new Ascenseur(1, 1, 3);
        Fusee fusee = new Fusee(20, 20, 150);

        voiture.afficher();
        voiture.seDeplacer();
        voiture.seDeplacer();
        voiture.seDeplacer();
        voiture.seDeplacer();
        voiture.seDeplacer();
        voiture.afficher();

        System.out.println("-----------");

        ascenseur.afficher();
        ascenseur.seDeplacer();
        ascenseur.seDeplacer();
        ascenseur.seDeplacer();
        ascenseur.seDeplacer();
        ascenseur.seDeplacer();
        ascenseur.seDeplacer();
        ascenseur.seDeplacer();
        ascenseur.afficher();

        System.out.println("-----------");

        fusee.afficher();
        fusee.seDeplacer();
        fusee.seDeplacer();
        fusee.seDeplacer();
        fusee.seDeplacer();
        fusee.seDeplacer();
        fusee.seDeplacer();
        fusee.seDeplacer();
        fusee.seDeplacer();
        fusee.afficher();
    }

}
