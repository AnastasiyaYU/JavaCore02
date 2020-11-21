package Day7;

import static java.lang.Math.abs;

public class Airplane {
    private String producer;
    private int releaseYear;
    private double length;
    private double weight;
    private int fuel;

    public Airplane(String producer, int releaseYear, double length, double weight){
        this.producer = producer;
        this.releaseYear = releaseYear;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + releaseYear + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    public int fillUp(int fuel) {
        this.fuel += fuel;
        return this.fuel;
    }

    public double getLength() {
        return length;
    }

    public static void compareAirplanes(Airplane air1, Airplane air2) {
        double difference = abs(air1.getLength() - air2.getLength());

        if (air1.getLength() > air2.getLength()) {
            System.out.println("Первый самолет длиннее на " + difference);
        } else if (air1.getLength() < air2.getLength()) {
            System.out.println("Второй самолет длиннее на " + difference);
        } else {
            System.out.println("Длина самолетов равна");
        }
    }
}
