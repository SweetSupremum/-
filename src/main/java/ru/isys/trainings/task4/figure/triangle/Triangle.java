package ru.isys.trainings.task4.figure.triangle;

import ru.isys.trainings.task4.figure.Figure;

public abstract class Triangle implements Figure {
    protected Double first_length;
    protected Double second_length;
    private Double angle;

    public Triangle(Double first_length, Double second_length, Double angle) {
        this.first_length = first_length;
        this.second_length = second_length;
        this.angle = angle;
    }

    @Override
    public Double square() {
        return 0.5 * first_length * second_length * Math.sin(angle);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + '{' +
                "first_length=" + first_length +
                ", second_length=" + second_length +
                ", angle=" + angle +
                '}';
    }
}
