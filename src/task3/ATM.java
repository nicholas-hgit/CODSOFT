package task3;


public class ATM {

    private final BankAccount clientAccount;


    public ATM(BankAccount clientAccount){
        this.clientAccount = clientAccount;
    }

    public void withdrawAmount(double amount) {
        double newAvailableBalance = clientAccount.getAvailableBalance() - amount;
        if (newAvailableBalance < 0){
            System.out.println("Insufficient funds for withdrawal");
            return;
        }

        clientAccount.setAvailableBalance(newAvailableBalance);
    }

    public void depositAmount(double amount) {
        if(amount <= 0){
            System.out.println("Invalid amount");
            return;
        }

        double newAvailableBalance = clientAccount.getAvailableBalance() + amount;
        clientAccount.setAvailableBalance(newAvailableBalance);
    }

    public void checkAvailableBalance(){
        System.out.printf("Available balance: R%.2f %n",clientAccount.getAvailableBalance());
    }

    public void displayMenu(){
        String menuOptions = """
                =============== select option ===============
                1. Check Balance
                2. Deposit
                3. Withdraw
                """;

        System.out.println(menuOptions);
    }
}
