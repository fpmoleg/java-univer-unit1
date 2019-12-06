package ua.univer.figures;

public class ColorLine extends Line implements Color {
    private int color;

    public ColorLine(Point start, Point end, int color) {
        super(start, end);
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
        return "ColorLine{" +
                "start = " + getStart()+
                ", end = " + getEnd()+
                ", color=" + color +
                '}';
    }
}
