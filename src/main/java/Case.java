public class Case {
    private int x;
    private int y;
    private Decor contient;

    public Case(int x, int y, Decor contient) {
        this.x = x;
        this.y = y;
        this.contient = contient;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Decor getContient() {
        return contient;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setContient(Decor contient) {
        this.contient = contient;
    }


}
