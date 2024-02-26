package task3;

public class BankAccountImpl implements BankAccount {
    private  double availableBalance;

    public BankAccountImpl() {
        this.availableBalance = 0.0;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

}
