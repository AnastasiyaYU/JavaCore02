package Day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setReleaseYear(1990);
        car1.setColor("Red");
        car1.setModel("bmw x5");

        System.out.println("Год выпуска машины " + car1.getReleaseYear());
        System.out.println("Цвет машины " + car1.getColor());
        System.out.println("Модель машины " + car1.getModel());
    }
}