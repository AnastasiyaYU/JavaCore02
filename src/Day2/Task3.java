package Day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите два положительных числа:");

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();

        if (a >= b) {
            System.out.println("Ошибка ввода. Первое число должно быть меньше второго.");
        } else {
            while (a < b) {
                if ((a % 5 == 0) && (a % 10 != 0)) {
                    System.out.print(a + " ");
                }
                a++;
            }
        }
    }
}