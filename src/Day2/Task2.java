package Day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите два положительных числа:");

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();

        if (a >= b) {
            System.out.println("Ошибка ввода. Первое число должно быть меньше второго.");
        } else {
            for (int i = a; i < b; i++) {
                if ((i % 5 == 0) && (i % 10 != 0)) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
