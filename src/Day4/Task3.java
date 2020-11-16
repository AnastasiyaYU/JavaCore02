package Day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int[][] matrice = new int[m][n];
        Random random = new Random();

        int max = 0;
        int maxIdx = 0;
        for(int i = 0; i < m; i++) {
            int sum = 0;
            for (int j =0; j < n; j++) {
                matrice[i][j] = random.nextInt(50);
                sum += matrice[i][j];
                //System.out.print(matrice[i][j] + " ");
            }
            if (sum > max) {
                max = sum;
                maxIdx = i;
            }
            //System.out.println(" //Сумма: " +  sum);
        }
        System.out.println("Ответ: " + maxIdx + " (индекс строки, сумма чисел в которой максимальна)");
    }
}
