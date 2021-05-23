package hbi.training.exercices.helb1ereJava.poo.interfacesex04;

public class Robot {
    private String nom;
    protected Position position;
    protected DirectionEnum direction;

    public Robot(String nom) {
        this(nom, new Position(0, 0), DirectionEnum.EST);
    }

    public Robot(String nom, Position position, DirectionEnum direction) {
        this.nom = nom;
        this.position = position;
        this.direction = direction;
    }

    public void avance() {
        avanceDe(1);
    }

    public void droite() {
        if (direction == DirectionEnum.NORD) {
            this.direction = DirectionEnum.EST;
        } else if (direction == DirectionEnum.EST) {
            this.direction = DirectionEnum.SUD;
        } else if (direction == DirectionEnum.SUD) {
            this.direction = DirectionEnum.OUEST;
        } else if (direction == DirectionEnum.OUEST) {
            this.direction = DirectionEnum.NORD;
        }
    }

    public void afficher() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Robot{" +
                "nom='" + nom + '\'' +
                ", position=" + position +
                ", direction=" + direction +
                '}';
    }

    protected void avanceDe(int nombreDePas) {
        if (direction == DirectionEnum.NORD) {
            position.setY(position.getY() + nombreDePas);
        } else if (direction == DirectionEnum.SUD) {
            position.setY(position.getY() - nombreDePas);
        } else if (direction == DirectionEnum.EST) {
            position.setX(position.getX() + nombreDePas);
        } else if (direction == DirectionEnum.OUEST) {
            position.setX(position.getX() - nombreDePas);
        }
    }
}
