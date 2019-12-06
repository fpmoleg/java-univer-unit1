package ua.univer.figures;

public class ColorPoint extends Point implements Color {

    private int color;

    public ColorPoint(int x, int y) {
        this(x,y,0);
    }

    public ColorPoint(int x, int y, int color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorPoint{" +
                super.getX() + ", " +
                super.getY() + ", " +
                "color=" + color +
                "} " ;
    }
}
