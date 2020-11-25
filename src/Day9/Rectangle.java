package Day9;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width*height; //Площадь прямоугольника равна произведению его сторон: S=a*b
    }

    @Override
    public double perimeter() {
        return 2*(width+height); //периметр прямоугольника P=2(a+b)
    }
}
