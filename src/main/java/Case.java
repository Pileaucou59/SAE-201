import java.util.Random;

public class Case {
    private int x;
    private int y;
    private TypeDecor contient;

    public Case(int x, int y, TypeDecor contient) {
        this.x = x;
        this.y = y;
        this.contient = contient;

    }

    public TypeDecor randomTypeDecor() {
        Random random = new Random();
        int ran = random.nextInt(5) + 1;

        return switch (ran) {
            case 1 -> TypeDecor.CACTUS;
            case 2 -> TypeDecor.MARGUERITE;
            default -> TypeDecor.HERBE;
        };
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public TypeDecor getContient() {
        return contient;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setContient(TypeDecor contient) {
        this.contient = contient;
    }


}
