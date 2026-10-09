
/**
 * Represents a savings account that stores the balance, deposits, withdrawls, interest earned, and interest rate.
 *
 * @author Jacob Patterson jpatterson@student.sdccd.edu
 * @version 1.0
 * @since 10/08/26
 */

public class BankAccount
{
    private double balance;
    private double deposit;
    private double withdraw;
    private double interest;
    private double monthlyIntRate;

    /**
     * Constructs a BankAccount with a default annualinterest rate of 4.4% and all other values set to zero.
     */
    public BankAccount()
    {
        balance = 0;
        deposit = 0;
        withdraw = 0;
        interest = 0;
        monthlyIntRate = 0.044 / 12;
    }

    /**
     * Constructs a BankAccount with a whole dollar starting balance and a specified annual interest rate.
     *
     * @param inBalance The starting account balance.
     * @param intRate The annual interest rate as a percentage.
     */
    public BankAccount(int inBalance, double intRate)
    {
        balance = inBalance;
        monthlyIntRate = intRate / 100 / 12;
    }

    /**
     * Constructs a BankAccount with a decimal starting balance and a specified annual interest rate.
     *
     * @param inBalance The starting account balance.
     * @param intRate The annual interest rate as a percentage.
     */
    public BankAccount(double inBalance, double intRate)
    {
        balance = inBalance;
        monthlyIntRate = intRate / 100 / 12;
    }

    /**
     * Adds a deposit in whole dollars to the account balance and updates the total deposits.
     *
     * @param add The amount of money being deposited
     */
    public void makeDeposit(int add)
    {
        balance += add;
        deposit += add;
    }

    /**
     * Adds a decimal deposit to the account balance and updates the total deposits
     *
     * @param add The amount of money being deposited
     */
    public void makeDeposit(double add)
    {
        balance += add;
        deposit += add;
    }

    /**
     * Subtracts a withdrawal in whole dollars from the balance and updates the total withdrawals
     *
     * @param sub The amount of money being withdrawn
     */
    public void makeWithdraw(int sub)
    {
        balance -= sub;
        withdraw += sub;
    }

    /**
     * Subtracts a decimal withdrawal from the balance and updates the total withdrawals.
     *
     * @param sub The amount of money being withdrawn.
     */
    public void makeWithdraw(double sub)
    {
        balance -= sub;
        withdraw += sub;
    }

    /**
     * Calculates monthly interest if the account balance is greater than zero. Adds the interest to the balance and updates the total interest earned
     */
    public void calcInterest()
    {
        if (balance > 0)
        {
            double monthlyInterest = balance * monthlyIntRate;
            balance += monthlyInterest;
            interest += monthlyInterest;
        }
    }

    /**
     * Returns the current account balance
     *
     * @return The current account balance
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * Returns the total amount deposited
     *
     * @return The total number of deposits
     */
    public double getDeposit()
    {
        return deposit;
    }

    /**
     * Returns the total amount withdrawn
     *
     * @return The total number of withdrawals
     */
    public double getWithdraw()
    {
        return withdraw;
    }

    /**
     * Returns the total interest made
     *
     * @return The total interest
     */
    public double getInterest()
    {
        return interest;
    }
}