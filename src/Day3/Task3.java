package Day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scrLine = new Scanner(System.in);

        for (int i = 0; i <= 5; i++) {
            System.out.println("Введите делимое:");
            double dividend = scrLine.nextDouble();

            System.out.println("Введите делитель:");
            double divisor = scrLine.nextDouble();

            if(divisor==0){
                System.out.println("Деление на 0");
                continue;
            }

            double result = dividend / divisor;
            System.out.println("Результат равен:" + result);
        }
    }
}
