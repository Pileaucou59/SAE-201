public class Loup extends Animal{
    public Loup(Case c, int vitesse) {
        super(c, vitesse);
    }

    @Override
    public void seDeplacer(int x, int y) {
        switch (this.caseActuelle.getContient()) {
            case HERBE:
                // Ajouter le comportement pour HERBE
                break;

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