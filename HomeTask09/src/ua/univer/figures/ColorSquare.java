package ua.univer.figures;

public class ColorSquare extends Square implements Color {
    private int color;

    public ColorSquare(Point a, Point b, Point c, Point d, int color) {
        super(a, b, c, d);
        this.color = color;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColorSquare{" +
                "color=" + color +
                ", a=" + this.getA() +
                ", b=" + this.getB() +
                ", c=" + this.getC() +
                ", d=" + this.getD() +
                '}';
    }
}
