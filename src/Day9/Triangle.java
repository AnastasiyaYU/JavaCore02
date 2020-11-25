package Day9;

import static java.lang.Math.*;

public class Triangle extends Figure {
    private double sideLengthA;
    private double sideLengthB;
    private double sideLengthC;

    public Triangle(String color, double sideLengthA, double sideLengthB, double sideLengthC) {
        super(color);
        this.sideLengthA = sideLengthA;
        this.sideLengthB = sideLengthB;
        this.sideLengthC = sideLengthC;
    }

    //Формула для нахождения площади треугольника по формуле Герона (если известны 3 стороны):
    //S= sqrt{p * (p-a) * (p-b) * (p-c)}, где a, b, c — стороны треугольника,
    // p — полупериметр треугольника, который можно найти по формуле
    // p = (a + b + c)/2
    @Override
    public double area() {
        double p = (sideLengthA+sideLengthB+sideLengthC)/2;
        return sqrt(p*(p-sideLengthA)*(p-sideLengthB)*(p-sideLengthC));
    }

    @Override
    public double perimeter() {
        return sideLengthA+sideLengthB+sideLengthC; //периметр треугольника P=a+b+c
    }
}
