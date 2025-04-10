public class Mouton extends Animal {

    public Mouton(int posx, int posy, int vitesse) {
        super(posx, posy, vitesse);
    }


    //Override
    public void seDeplacer(Decor d) {
        switch (d) {
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