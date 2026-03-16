package lab2.problem3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<Account>();
    }

    public void openAccount(Account acc) {
        accounts.add(acc);
    }

    public void closeAccount(int accNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if ((int) accounts.get(i).getAccountNumber() == accNumber) {
                accounts.remove(i);
                return;
            }
        }
    }

    public Account getAccount(int accNumber) {
        for (Account acc : accounts) {
            if ((int) acc.getAccountNumber() == accNumber) {
                return acc;
            }
        }
        return null;
    }

    public void update() {
        for (Account acc : accounts) {
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).addInterest();
            } else if (acc instanceof CheckingAccount) {
                ((CheckingAccount) acc).deductFee();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bank Accounts:\n");
        for (Account acc : accounts) {
            sb.append(acc.toString()).append("\n");
        }
        return sb.toString();
    }

    public void printAllAccounts() {
        System.out.println(toString());
    }
}
