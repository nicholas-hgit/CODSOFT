package task3;

public abstract class AbstractBankAccount implements BankAccount {
    protected double availableBalance;

    protected AbstractBankAccount(){
        this.availableBalance = 0.0;
    }
}
