package Day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike(2013,"Black","Yamaha YZF-R6");
        Motorbike motorbike2 = new Motorbike();

        System.out.println("Год выпуска мотоцикла " + motorbike1.getReleaseYear());
        System.out.println("Цвет мотоцикла " + motorbike1.getColor());
        System.out.println("Модель мотоцикла " + motorbike1.getModel());
        System.out.println("");
        System.out.println("Год выпуска мотоцикла " + motorbike2.getReleaseYear());
        System.out.println("Цвет мотоцикла " + motorbike2.getColor());
        System.out.println("Модель мотоцикла " + motorbike2.getModel());
    }
}
