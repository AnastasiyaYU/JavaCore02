package Day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String stringAll = "";
        for(int i = 0; i <= 20000; i++) {
            stringAll += " " + i;
        }
        System.out.println(stringAll);

        long finish = System.currentTimeMillis();
        long timeConsumedMillis1 = finish - start;


        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(" ");
        for(int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;

        System.out.println("Время работы программы при конкатенации String: " + timeConsumedMillis1);
        System.out.println("Время работы программы при конкатенации StringBuilder: " + timeConsumedMillis2);
    }
}
