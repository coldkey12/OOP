package lab2.problem3;

public class CheckingAccount extends Account {
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 5;
    private static final double TRANSACTION_FEE = 0.02;

    public CheckingAccount(int accNumber) {
        super(accNumber);
        this.transactionCount = 0;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactionCount++;
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
    }

    public void deductFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            double fee = (transactionCount - FREE_TRANSACTIONS) * TRANSACTION_FEE;
            super.withdraw(fee);
        }
        transactionCount = 0;
    }

    @Override
    public String toString() {
        return super.toString() + " (Checking, Transactions: " + transactionCount + ")";
    }
}
