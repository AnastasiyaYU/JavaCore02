package Day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scrLine = new Scanner(System.in);

        while (true) {
            System.out.println("Введите город:");
            String city = scrLine.nextLine();

            if (city.equalsIgnoreCase("Stop"))
                break;

            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        }
    }
}
