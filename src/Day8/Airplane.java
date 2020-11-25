package Day8;

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

    public String toString() {
        return "Изготовитель: " + producer + ", год выпуска: " + releaseYear + ", длина: " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel;
    }

    public int fillUp(int fuel) {
        this.fuel += fuel;
        return this.fuel;
    }
}
