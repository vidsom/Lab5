import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         * Checking account.
         */
        CHECKINGS,
        /**
         * Savings account.
         */
        SAVINGS,
        /**
         * Account for students.
         */
        STUDENT,
        /**
         * Work account.
         */
        WORKPLACE
    }

    public static int bankAccountCounter;
    private int accountNumber;
    private BankAccountType accountType;

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(final double setAccountBalance) {
        this.accountBalance = setAccountBalance;
    }

    private double accountBalance;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(final String setOwnerName) {
        this.ownerName = setOwnerName;
    }

    private String ownerName;
    private double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        bankAccountCounter++;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
