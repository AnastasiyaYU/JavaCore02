package Day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scrLine = new Scanner(System.in);

        while (true) {
            System.out.println("Введите делимое:");
            double dividend = scrLine.nextDouble();

            System.out.println("Введите делитель:");
            double divisor = scrLine.nextDouble();

            if (divisor == 0)
                break;

            double result = dividend / divisor;
            System.out.println("Результат равен:" + result);
        }
    }
}
