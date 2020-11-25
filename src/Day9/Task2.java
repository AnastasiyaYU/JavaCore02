package Day9;

public class Task2 {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red",10, 10, 10),
                new Triangle("Green",10, 20, 30),
                new Triangle("Red",10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange",40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue",5)
        };

        System.out.println("Сумма площадей красных фигур = " + calculateRedArea(figures));
        System.out.println("Сумма периметров красных фигур = " + calculateRedPerimeter(figures));
    }

    //метод, принимая на вход массив геометрических фигур, должен вернуть сумму периметров красных фигур
    public static double calculateRedPerimeter(Figure[] figures) {
        double sumPerimeter = 0;
        for(int i=0; i<figures.length; i++) {
            if (figures[i].getColor().equals("Red")) {
                sumPerimeter += figures[i].perimeter();
            }
        }
        return sumPerimeter;
    }

    //метод, принимая на вход массив геометрических фигур, должен вернуть сумму площадей красных фигур.
    public static double calculateRedArea(Figure[] figures) {
        double sumArea = 0;
        for(int i=0; i<figures.length; i++) {
            if (figures[i].getColor().equals("Red")) {
                sumArea += figures[i].area();
            }
        }
        return sumArea;
    }

}
