public class Vegetaux {
    private TypeVegetaux type;
    private int posX;
    private int posY;

    public enum TypeVegetaux {
    HERBE,
    MARGUERITE,
    CACTUS
}

    public Vegetaux(TypeVegetaux type, int posX, int posY) {
        this.type = type;
        this.posX = posX;
        this.posY = posY;
    }

    public TypeVegetaux getType() {
        return type;
    }

    public void setType(TypeVegetaux type) {
        this.type = type;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
