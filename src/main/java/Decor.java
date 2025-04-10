public class Decor {
    private TypeDecor type;
    private int posX;
    private int posY;

    public enum TypeDecor {
    HERBE,
    MARGUERITE,
    CACTUS,
    Rocher
}

    public Decor(TypeDecor type, int posX, int posY) {
        this.type = type;
        this.posX = posX;
        this.posY = posY;
    }

    public TypeDecor getType() {
        return type;
    }

    public void setType(TypeDecor type) {
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
