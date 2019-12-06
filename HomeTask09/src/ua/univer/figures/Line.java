package ua.univer.figures;

public class Line extends AbstractFigure {
    private Point start;

    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Line(Line line) {
        this(new Point(line.getStart()),
             new Point(line.getEnd())
        );
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double getLength() {
        return Math.sqrt(
                Math.pow(start.getX() - end.getX(), 2) +
                Math.pow(start.getY() - end.getY(), 2)
        );
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                "hashline = "+hashCode()+
                '}';
    }
}
