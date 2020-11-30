package Day11;

public class Courier implements Worker {
    private double salary;
    final private Warehouse warehouse;

    public Courier(Warehouse warehouse){
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setBalance(1000);
    }

    @Override
    public void bonus() {
        if(warehouse.getBalance()%1000000 == 0) {
            salary *= 2;
        }
    }
}
