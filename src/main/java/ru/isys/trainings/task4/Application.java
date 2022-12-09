package ru.isys.trainings.task4;

import ru.isys.trainings.task4.figure.Figure;
import ru.isys.trainings.task4.figure.rectangle.Rectangle;
import ru.isys.trainings.task4.figure.rectangle.Square;
import ru.isys.trainings.task4.figure.triangle.EquilateralTriangle;
import ru.isys.trainings.task4.figure.triangle.RightTriangle;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static final double TEST_PERIMETER = 12.0;

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1.0, 2.0);
        List<? extends Figure> figures = new ArrayList<>(
                List.of(
                        rectangle,
                        new Square(1.0),
                        new EquilateralTriangle(1.0),
                        new RightTriangle(3.0, 4.0)
                )
        );
        figures.forEach(figure -> System.out.println(figure.toString() + " " + figure.perimeter().toString()));

        rectangle.setLength(2.0);
        rectangle.setWidth(4.0);
        Double perimeter = rectangle.perimeter();
        System.out.println("rectangle.perimeter() = " + perimeter + " right? " + perimeter.equals(TEST_PERIMETER));
    }
}
