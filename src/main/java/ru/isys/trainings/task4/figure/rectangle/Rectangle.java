package ru.isys.trainings.task4.figure.rectangle;

import ru.isys.trainings.task4.figure.Figure;

public class Rectangle implements Figure {
    private Double length;
    private Double width;


    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public Double square() {
        return length * width;
    }


    @Override
    public Double perimeter() {
        return 2 * (length + width);
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
