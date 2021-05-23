package hbi.training.exercices.helb1ereJava.poo.interfacesex04;

public class RobotNGA extends Robot {

    public RobotNGA(String nom) {
        super(nom);
    }

    public RobotNGA(String nom, Position position, DirectionEnum direction) {
        super(nom, position, direction);
    }

    public void avance(int nombreDePas) {
        this.avanceDe(nombreDePas);
    }

    public void gauche() {
        if (direction == DirectionEnum.NORD) {
            this.direction = DirectionEnum.OUEST;
        } else if (direction == DirectionEnum.EST) {
            this.direction = DirectionEnum.NORD;
        } else if (direction == DirectionEnum.SUD) {
            this.direction = DirectionEnum.EST;
        } else if (direction == DirectionEnum.OUEST) {
            this.direction = DirectionEnum.SUD;
        }
    }

    public void demiTour() {
        if (direction == DirectionEnum.NORD) {
            this.direction = DirectionEnum.SUD;
        } else if (direction == DirectionEnum.EST) {
            this.direction = DirectionEnum.OUEST;
        } else if (direction == DirectionEnum.SUD) {
            this.direction = DirectionEnum.NORD;
        } else if (direction == DirectionEnum.OUEST) {
            this.direction = DirectionEnum.EST;
        }
    }

}
