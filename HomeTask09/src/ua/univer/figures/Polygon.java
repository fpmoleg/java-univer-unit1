package ua.univer.figures;

import java.util.Arrays;

public class Polygon extends AbstractFigure {
    private Point[] points;

    public Polygon(Point ...points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}
