package task3;
import java.util.Scanner;

@SuppressWarnings("InfiniteLoopStatement")
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final ATM automatedTellerMachine = new ATM(new BankAccountImpl());

        do {

            automatedTellerMachine.displayMenu();
            int selectedOption = input.nextInt();

            switch (selectedOption) {

                case 1 -> automatedTellerMachine.checkAvailableBalance();
                case 2 -> {
                    System.out.println("Enter amount to deposit");
                    /*
                     * exception thrown by nextDouble is not handled because
                     * an atm will most likely not have a keyboard that
                     * support letter keys
                     */
                    double amount = input.nextDouble();
                    automatedTellerMachine.depositAmount(amount);
                }

                case 3 -> {
                    System.out.println("Enter amount to withdraw");
                    double amount = input.nextDouble();
                    automatedTellerMachine.withdrawAmount(amount);
                }

                default -> System.out.println("Invalid option");
            }
        }while (true);
    }

}
