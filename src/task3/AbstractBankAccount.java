package task3;

abstract class AbstractBankAccount implements BankAccount {
    protected double availableBalance;

    protected AbstractBankAccount(){
        this.availableBalance = 0.0;
    }
}
