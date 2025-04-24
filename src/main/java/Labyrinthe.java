import java.util.ArrayList;
import java.util.Random;

public class Labyrinthe {
    private int nbLignes;
    private int nbColonnes;
    private Case[][] cases;
    private Case sortie;

    public Labyrinthe(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.cases = new Case[nbLignes][nbColonnes];

        // Initialisation par défaut de toutes les cases
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                cases[i][j] = new Case(i, j, TypeDecor.ROCHER);
            }
        }

        sidewinder();
        contour();
    }

    public void contour(){
        // Remplir chaque case du contour avec un décor de type ROCHER

        ArrayList<Case> CasesContour = new ArrayList<>();

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (i == 0 || i == nbLignes - 1 || j == 0 || j == nbColonnes - 1) {
                    cases[i][j] = new Case(i, j, TypeDecor.ROCHER);

                    // On vérifie que la case n'est pas un angle, si c'est le cas on l'ajoute à la liste
                    if (!(i == 0 && j == 0) || !(i == 0 && j == nbColonnes - 1) || !(i == nbLignes - 1 && j == 0) || !(i == nbLignes - 1 && j == nbColonnes - 1)) {
                        CasesContour.add(cases[i][j]);
                    }
                }
            }
        }

        // On crée une sortie de labyrinthe aléatoire dans le contour

        int randomIndex = (int) (Math.random() * CasesContour.size());
        Case sortie = CasesContour.get(randomIndex);
        sortie.setContient(TypeDecor.HERBE);
        this.sortie = sortie;
    }

    public void sidewinder() {
        Random rand = new Random();

        for (int i = 1; i < nbLignes ; i += 2) {
            int runStart = 1;

            for (int j = 1; j < nbColonnes ; j += 2) {
                cases[i][j] = new Case(i, j, TypeDecor.HERBE); // chemin

                boolean atEasternBoundary = (j + 2 >= nbColonnes - 1);
                boolean atNorthernBoundary = (i == 1);
                boolean carveEast = rand.nextBoolean();

                if (!atEasternBoundary && (carveEast || atNorthernBoundary)) {
                    // Creuser à droite
                    cases[i][j + 1] = new Case(i, j + 1, TypeDecor.HERBE);
                } else {
                    // Creuser vers le haut à partir d'une cellule de la "run"
                    int randCol = runStart + 2 * rand.nextInt((j - runStart) / 2 + 1);
                    cases[i - 1][randCol] = new Case(i - 1, randCol, TypeDecor.HERBE);
                    runStart = j + 2;
                }
            }
        }
    }

public void afficherLabyrinthe() {
    for (int i = 0; i < nbLignes; i++) {
        // retourner à la ligne
        System.out.println();

        for (int j = 0; j < nbColonnes; j++) {
            switch (cases[i][j].getContient()) {
                case ROCHER:
                    System.out.print("X");
                    break;

                case HERBE:
                    System.out.print(".");
                    break;

                case MARGUERITE:
                    System.out.print("M");
                    break;

                case CACTUS:
                    System.out.print("C");
                    break;
            }
        }
    }
}


    public Case getSortie() {
        return sortie;
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
