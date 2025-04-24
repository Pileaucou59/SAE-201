import java.util.ArrayList;
import java.util.List;
import java.util.Random; // N'oubliez pas l'import pour Random

public class Mouton extends Animal {

    private Labyrinthe labyrinthe; // Référence au labyrinthe
    private Random random; // Générateur aléatoire

    // Modification du constructeur pour accepter le labyrinthe
    public Mouton(Case c, Labyrinthe labyrinthe) {
        super(c, 2); // Appelle le constructeur de la classe Animal
        this.labyrinthe = labyrinthe; // Initialise la référence au labyrinthe
        this.random = new Random(); // Initialise le générateur aléatoire
    }

    @Override
    public void seDeplacer(int x, int y) {
        int nombrePasAleatoires = 0;

        // Détermine le nombre de pas aléatoires en fonction du contenu de la case actuelle
        switch (this.caseActuelle.getContient()) {
            case MARGUERITE:
                nombrePasAleatoires = 4; // 4 déplacements aléatoires
                break;

            case CACTUS:
                nombrePasAleatoires = 1; // 1 déplacement aléatoire
                break;

            default:
                // Comportement par défaut pour HERBE ou autres (sauf Rocher qui est un mur)
                nombrePasAleatoires = 2; // 2 déplacements aléatoires
                break;
        }

        // Effectue le nombre de pas aléatoires déterminé
        for (int i = 0; i < nombrePasAleatoires; i++) {
            int currentX = this.caseActuelle.getX();
            int currentY = this.caseActuelle.getY();

            List<Case> voisinsPossibles = new ArrayList<>();

            // Définir les directions de déplacement possibles (Haut, Bas, Gauche, Droite)
            int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}}; // {dx, dy}

            // Vérifier chaque direction pour trouver les voisins possibles
            for (int[] dir : directions) {
                int nextX = currentX + dir[0];
                int nextY = currentY + dir[1];

                // Vérifier si les nouvelles coordonnées sont dans les limites du labyrinthe
                if (nextX >= 0 && nextX < labyrinthe.getNbColonnes() && nextY >= 0 && nextY < labyrinthe.getNbLignes()) {
                    // Récupérer la case voisine
                    Case voisin = labyrinthe.getCases()[nextY][nextX];

                    // Vérifie si la case voisine existe et n'est pas un mur (Rocher)
                    if (voisin != null && voisin.getContient() != TypeDecor.Rocher) {
                        voisinsPossibles.add(voisin); // Ajouter la case voisine à la liste des possibilités
                    }
                }
            }

            // Si des déplacements sont possibles, en choisir un aléatoirement et se déplacer
            if (!voisinsPossibles.isEmpty()) {
                int randomIndex = random.nextInt(voisinsPossibles.size());
                Case prochaineCase = voisinsPossibles.get(randomIndex);
                this.setCaseActuelle(prochaineCase); // Mettre à jour la case actuelle de l'agent


            } else {
                // Aucun déplacement possible

            }
        }
    }
}