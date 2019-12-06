package ua.univer.figures;

public class ColorTriangle extends Triangle implements Color{

    private int color;

    public ColorTriangle(Point a, Point b, Point c, int color) {
        super(a, b, c);

        this.color = color;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColorTriangle{" +
                "a=" + getA() +
                ", b=" + getB() +
                ", c=" + getC() +
                ", color=" + color +
                '}';
    }
}
