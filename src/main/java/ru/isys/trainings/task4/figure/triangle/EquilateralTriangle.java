package ru.isys.trainings.task4.figure.triangle;

import static java.lang.Math.PI;

public class EquilateralTriangle extends Triangle {

    public static final double ANGLE = PI / 3;

    public EquilateralTriangle(Double first_length) {
        super(first_length, first_length, ANGLE);
    }

    @Override
    public Double perimeter() {
        return 3 * first_length;
    }
}
