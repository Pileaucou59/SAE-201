import java.util.List;

public abstract class Animal {
    private int positionx;
    private int positiony;
    private int vitesse;
    private int vision;
    private Etat etat;

    public enum Etat {
        FUITE,
        CHASSE,
        NORMAL;
    }


    public Animal(int positionx, int positiony, int vitesse) {
        this.positionx = positionx;
        this.positiony = positiony;
        this.vision = 5;
        this.vitesse = vitesse;
        this.etat = Etat.NORMAL;
    }

    public int getPositionx() {
        return positionx;
    }

    public int getPositiony() {
        return positiony;
    }

    public int getVitesse() {
        return vitesse;
    }

    public int getVision() {
        return vision;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public void seDeplacer(int x, int y) {
        this.positionx += x;
        this.positiony += y;
    }



}