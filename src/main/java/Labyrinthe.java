public class Labyrinthe {
    private int nbLignes;
    private int nbColonnes;
    private Case[][] cases;

    public Labyrinthe(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.cases = new Case[nbLignes][nbColonnes];
    }
}
