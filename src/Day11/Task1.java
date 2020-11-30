package Day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse1 = new Warehouse();
        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);

        // вызоваем 1500 раз метод doWork() у picker1, чтобы на складе был отгружен 1500-й заказ
        for (int x = 0; x < 1500; x++) {
            picker1.doWork();
        }
        // вызоваем 1000 раз метод doWork() у courier1, чтобы складом был заработан 1.000.000
        for (int x = 0; x < 1000; x++) {
            courier1.doWork();
        }
        // вызоваем bonus(), чтобы каждый из сотрудников получил бонус.
        courier1.bonus();
        picker1.bonus();

        // Выводим в консоль баланс, количество выполненных заказов на складе и ЗП каждого из сотрудников.
        System.out.println(warehouse1);
        System.out.println("Salary picker " + picker1.getSalary());
        System.out.println("Salary courier " + courier1.getSalary());

        //Создать второй склад, также принять по 1 сотруднику с однократным вызовом doWork() у каждого
        Warehouse warehouse2 = new Warehouse();
        Picker picker2 = new Picker(warehouse2);
        Courier courier2 = new Courier(warehouse2);
        picker2.doWork();
        courier2.doWork();

        //Проконтролировать, что у склада 1 и его сотрудников при этом значения не меняются.
        System.out.println(warehouse1);
        System.out.println("Salary picker " + picker1.getSalary());
        System.out.println("Salary courier " + courier1.getSalary());
        /*System.out.println(warehouse2);
        System.out.println("Salary picker " + picker2.getSalary());
        System.out.println("Salary courier " + courier2.getSalary());*/
    }
}
