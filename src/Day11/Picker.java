package Day11;

public class Picker implements Worker {
    private double salary;
    final private Warehouse warehouse;

    public Picker(Warehouse warehouse){
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(1);
    }

    @Override
    public void bonus() {
        if(warehouse.getCountOrder()%1500 == 0) {
            salary *= 3;
        }
    }
}
