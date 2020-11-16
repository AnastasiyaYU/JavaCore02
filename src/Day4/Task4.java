package Day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int n = 100;

        int[] array = new int[n];
        Random random = new Random();

        for(int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);
        System.out.println("Элементы массива:");
        System.out.println(Arrays.toString(array));
        System.out.println("");

        int maxSum = 0;
        int maxInd = 0;
        for(int i = 0; i < array.length-2; i++) {
            int sum = 0;
            for (int j = i; j < i+3; j++) {
                sum += array[j];
            }
            if (sum>maxSum) {
                maxSum = sum;
                maxInd = i;
            }
            //System.out.println("Сумма тройки: " + sum);
        }

        System.out.println("Максимальная сумма тройки: " + maxSum);
        System.out.println("Индекс первого элемента максимальной тройки: " + maxInd);
    }
}
