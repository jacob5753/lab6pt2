import java.util.Scanner;
/**
 * Uses the bankaccount class by allowing user to calculate savings balances using dollar amounts or decimal currency then displays the edning balance, deposit, withdrawls, and interets earned 
 * @author Jacob Patterson jpatterson@student.sdccd.edu
 * @version 1.0
 * @since 10/08/26
 */

public class BankAccountDemo
{
    /**
     * Displays the menu and asks user to select dollar mode or currency mode then validates the input before running the selected mode.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int choice;

        do
        {
            System.out.print("Press 1 to use whole dollars or 2 to use currency: ");
            choice = keyboard.nextInt();
        }
        while (choice != 1 && choice != 2);

        if (choice == 1)
        {
            useWholeDollarMode();
        }
        else
        {
            useCurrencyMode();
        }
    }

    /**
     * Asks the user for the starting balance, interest rate and number of months. Creates a BankAccount object and processes deposits, withdrawals, and interest for each month using whole dollar amounts then displays the ending account information.
     */
    public static void useWholeDollarMode()
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your starting balance: $");
        int balance = keyboard.nextInt();

        System.out.print("What is your interest rate? (ie enter 3.5 for 3.5%): ");
        double intRate = keyboard.nextDouble();

        System.out.print("How many months do you want to calculate? ");
        int counter = keyboard.nextInt();

        System.out.println("===============================");

        BankAccount bankAccount = new BankAccount(balance, intRate);

        for (int i = 1; i <= counter; i++)
        {
            System.out.print("Enter Month " + i + " deposits $");
            bankAccount.makeDeposit(keyboard.nextInt());
            System.out.print("Enter Month " + i + " withdraws $");
            bankAccount.makeWithdraw(keyboard.nextInt());
            bankAccount.calcInterest();
        }
        System.out.printf("\nEnding balance: $%,.2f", bankAccount.getBalance());
        System.out.printf("\nTotal deposits: $%,.2f", bankAccount.getDeposit());
        System.out.printf("\nTotal withdraw: $%,.2f", bankAccount.getWithdraw());
        System.out.printf("\nTotal interest: $%,.2f", bankAccount.getInterest());
    }
    /**
     * Asks the user for the starting balance, interest rate, and number of months. Creates a BankAccount object and processes deposits, withdrawals, and interest for each month using decimal currency amounts then displays the ending account information.
     */
    public static void useCurrencyMode()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your starting balance: $");
        double balance = keyboard.nextDouble();
        System.out.print("What is your interest rate? (ie enter 3.5 for 3.5%): ");
        double intRate = keyboard.nextDouble();
        System.out.print("How many months do you want to calculate? ");
        int counter = keyboard.nextInt();
        System.out.println("===============================");
        BankAccount bankAccount = new BankAccount(balance, intRate);
        for (int i = 1; i <= counter; i++)
        {
            System.out.print("Enter Month " + i + " deposits $");
            bankAccount.makeDeposit(keyboard.nextDouble());
            System.out.print("Enter Month " + i + " withdraws $");
            bankAccount.makeWithdraw(keyboard.nextDouble());
            bankAccount.calcInterest();
        }

        System.out.printf("\nEnding balance: $%,.2f", bankAccount.getBalance());
        System.out.printf("\nTotal deposits: $%,.2f", bankAccount.getDeposit());
        System.out.printf("\nTotal withdraw: $%,.2f", bankAccount.getWithdraw());
        System.out.printf("\nTotal interest: $%,.2f", bankAccount.getInterest());
    }
}