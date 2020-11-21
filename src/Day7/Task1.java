package Day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 1997, 70.6,213.8);
        Airplane airplane2 = new Airplane("Airbus S.A.S", 2007, 31.44,60.4);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
