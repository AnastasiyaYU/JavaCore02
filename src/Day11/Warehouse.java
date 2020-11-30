package Day11;

public class Warehouse {
    private int  countOrder;
    private double balance;

    public void setBalance(double balance) {
        this.balance += balance;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder += countOrder;
    }

    public double getBalance() {
        return balance;
    }

    public int getCountOrder() {
        return countOrder;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "countOrder=" + countOrder +
                ", balance=" + balance +
                '}';
    }


}
