package Day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите два положительных числа:");

        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();

        int val = a;
        while (val < b) {
            if ((val%5 == 0) && (val%10 != 0)) {
                System.out.print(val + " ");
            }
            val++;
        }
    }
}