public class Labyrinthe {
    private int nbLignes;
    private int nbColonnes;
    private Case[][] cases;

    public Labyrinthe(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.cases = new Case[nbLignes][nbColonnes];
    }

    public int getNbLignes() {
        return nbLignes;
    }

    public int getNbColonnes() {
        return nbColonnes;
    }

    public Case[][] getCases() {
        return cases;
    }

    public void setNbLignes(int nbLignes) {
        this.nbLignes = nbLignes;
    }

    public void setNbColonnes(int nbColonnes) {
        this.nbColonnes = nbColonnes;
    }

    public void setCases(Case[][] cases) {
        this.cases = cases;
    }
}
