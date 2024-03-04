package task3;

class SavingsAccount extends AbstractBankAccount {

    public SavingsAccount() {
        super();
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

}
