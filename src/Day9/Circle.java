package Day9;

import static java.lang.Math.*;

public class Circle extends Figure {
    private int radius;

    public Circle(String color,int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI*radius*radius; //площадь круга S=πR²
    }

    @Override
    public double perimeter() {
        return 2*PI*radius; //периметр круга P=2πR
    }
}
