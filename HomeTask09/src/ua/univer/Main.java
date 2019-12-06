package ua.univer;

import ua.univer.figures.*;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        AbstractFigure[] figures = new AbstractFigure[10];
        AbstractFigure[] coloredFigures = new AbstractFigure[10];
        AbstractFigure[] noColoredFigures = new AbstractFigure[10];

        figures[0] = new Point(1, 1);
        figures[1] = new ColorPoint(2, 2, 2);
        figures[2] = new Line(new Point(3,3), new Point(4, 4));
        figures[3] = new ColorLine(new Point(5,5), new Point(6, 6), 3);
        figures[4] = new Triangle(
                new Point(1, 10), new Point(2, 22), new Point(3, 33)
        );
        figures[5] = new ColorTriangle(
                new Point(2, 10), new Point(1, 22), new Point(4, 44), 4
        );
        figures[6] = new Square(
                new Point(0, 0), new Point(0, 3), new Point(3,3), new Point(3, 0)
        );
        figures[7] = new ColorSquare(
                new Point(0, 0), new Point(0, 4), new Point(4,4), new Point(4, 0), 7
        );

        figures[8] = new Polygon(
                new Point(0, 0), new Point(1, 4), new Point(2,3),
                new Point(4, 10), new Point(5, 5), new Point(10, 50)
        );

        int i,j;

        i = 0;
        j = 0;

        for (AbstractFigure figure: figures) {
            if (figure != null) {
                if (figure instanceof Color) {
                    coloredFigures[i++] = figure;
                } else {
                    noColoredFigures[j++] = figure;
                }
            }
        }

        System.out.println(Arrays.toString(coloredFigures));
        System.out.println(Arrays.toString(noColoredFigures));
    }
}
