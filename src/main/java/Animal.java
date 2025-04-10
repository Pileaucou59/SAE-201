public abstract class Animal {
    private int posX;
    private int posY;
    private int vitesse;
    private int vision;
    private Etat etat;

    public enum Etat {
        FUITE,
        CHASSE,
        NORMAL;
    }


    public Animal(int positionx, int positiony, int vitesse) {
        this.posX = positionx;
        this.posY = positiony;
        this.vision = 5;
        this.vitesse = vitesse;
        this.etat = Etat.NORMAL;
    }

    public int getPositionx() {
        return posX;
    }

    public int getPosY() {
        return posY;
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
        this.posX += x;
        this.posY += y;
    }

}