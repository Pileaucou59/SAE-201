public abstract class Animal {
    protected Case caseActuelle;
    protected int vitesse;
    protected int vision;
    protected Etat etat;

    public enum Etat {
        FUITE,
        CHASSE,
        NORMAL;
    }


    public Animal(Case c, int vitesse) {
        this.caseActuelle = c;
        this.vision = 5;
        this.vitesse = vitesse;
        this.etat = Etat.NORMAL;
    }

    public Case getCaseActuelle() {
        return caseActuelle;
    }

    public void setCaseActuelle(Case caseActuelle) {
        this.caseActuelle = caseActuelle;
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

    public abstract void seDeplacer(int x, int y);

}