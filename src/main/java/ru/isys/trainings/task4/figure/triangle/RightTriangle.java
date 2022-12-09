package ru.isys.trainings.task4.figure.triangle;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class RightTriangle extends Triangle {

    public static final double ANGLE = Math.PI / 2;

    public RightTriangle(Double first_length, Double second_length) {
        super(first_length, second_length, ANGLE);
    }

    @Override
    public Double perimeter() {
        return first_length + second_length + calculatedHypotenuse();
    }

    private double calculatedHypotenuse() {
        return sqrt(pow(first_length, 2) + pow(second_length, 2));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
