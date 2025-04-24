public class Mouton extends Animal {

    public Mouton(Case c) {
        super(c, 2);
    }


    @Override
    public void seDeplacer(int x, int y) {
        switch (this.caseActuelle.getContient()) {

            case MARGUERITE:
                // Ajouter le comportement pour MARGUERITE
                break;

            case CACTUS:
                // Ajouter le comportement pour CACTUS
                break;

            default:
                // Ajouter un comportement par défaut si nécessaire
                break;
        }

    }
}