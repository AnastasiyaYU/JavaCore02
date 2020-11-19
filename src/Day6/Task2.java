package Day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 1997, 70.6,413.8);

        airplane.info();
        airplane.fillUp(100);
        airplane.info();
    }
}
