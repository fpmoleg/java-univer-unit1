package ua.univer.figures;

public class Triangle extends AbstractFigure {
    private Point a;
    private Point b;
    private Point c;

    private Line ab;
    private Line bc;
    private Line ac;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;

        ab = null;
        ac = null;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;

        ab = null;
        bc = null;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;

        bc = null;
        ac = null;
    }

    public Line getAB() {
       if(ab == null) {
           ab = new Line(a,b);
       }

       return ab;
    }

    public double getLengthAB() {
        return getAB().getLength();
    }

    public Line getBC() {
        if (bc == null) {
            bc = new Line(b, c);
        }

        return bc;
    }

    public double getLengthBC() {
        return getBC().getLength();
    }

    public Line getAC() {
        if (ac == null) {
            ac = new Line(a, c);
        }

        return ac;
    }

    public double getLengthAC() {
        return getAC().getLength();
    }

    public boolean isDegenerate() {
        return (getLengthAC() == this.getLengthAB() + getLengthBC());
    }

    public double getPerimeter() {
        return getLengthAB() + getLengthBC() + getLengthAC();
    }

    public double getArea() {
        double p = getPerimeter() / 2;

        return Math.sqrt(
                p *
                (p - getLengthAB()) *
                (p - getLengthBC()) *
                (p - getLengthAC())
        );
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
