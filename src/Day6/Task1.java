package Day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setReleaseYear(1990);
        car1.setColor("Red");
        car1.setModel("bmw x5");

        car1.info();
        System.out.println(car1.yearDifference(2000));

        Motorbike motorbike1 = new Motorbike(2013,"Black","Yamaha YZF-R6");

        motorbike1.info();
        System.out.println(motorbike1.yearDifference(2020));
    }
}
