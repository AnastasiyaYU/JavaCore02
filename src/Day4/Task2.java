package Day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int n = 100;
        int max;
        int min;
        int count;
        int sum;
        int[] array = new int[n];
        Random random = new Random();

        for(int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);
        System.out.println("Элементы массива:");
        System.out.println(Arrays.toString(array));
        System.out.println("");

        max = 0;
        for(int x: array) {
            if (x>max)
                max = x;
        }
        System.out.println("наибольший элемент массива: " + max);

        min = 10000;
        for(int x: array) {
            if (x<min)
                min = x;
        }
        System.out.println("наименьший элемент массива: " + min);

        count = 0;
        sum = 0;
        for (int x: array) {
            if(x%10 == 0) {
                count++;
                sum += x;
            }
        }
        System.out.println("количество элементов массива, оканчивающихся на 0: " + count);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sum);

    }
}
