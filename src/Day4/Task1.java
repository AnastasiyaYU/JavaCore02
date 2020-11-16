package Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int n = scr.nextInt();
        int count;
        int sum;
        int[] array = new int[n];
        Random random = new Random();

        for(int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10);
        System.out.println("Элементы массива:");
        System.out.println(Arrays.toString(array));
        System.out.println("");

        count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>8)
                count++;
        }
        System.out.println("Количество чисел больше 8: " + count);

        count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==1)
                count++;
        }
        System.out.println("Количество чисел равных 1: " + count);

        count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0)
                count++;
        }
        System.out.println("Количество четных чисел: " + count);

        count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0)
                count++;
        }
        System.out.println("Количество нечетных чисел: " + count);

        sum = 0;
        for(int i = 0; i < array.length; i++)
            sum += array[i];
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
