package lab2.problem3;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savings1 = new SavingsAccount(1001, 5.0);
        SavingsAccount savings2 = new SavingsAccount(1002, 3.5);
        CheckingAccount checking1 = new CheckingAccount(2001);
        CheckingAccount checking2 = new CheckingAccount(2002);

        bank.openAccount(savings1);
        bank.openAccount(savings2);
        bank.openAccount(checking1);
        bank.openAccount(checking2);

        savings1.deposit(1000.0);
        savings2.deposit(2500.0);
        checking1.deposit(500.0);
        checking2.deposit(1200.0);

        System.out.println("=== After initial deposits ===");
        bank.printAllAccounts();

        savings1.withdraw(200.0);
        checking1.withdraw(100.0);

        System.out.println("=== After withdrawals ===");
        bank.printAllAccounts();

        checking2.transfer(300.0, savings1);

        System.out.println("=== After transfer of $300 from checking #2002 to savings #1001 ===");
        bank.printAllAccounts();

        checking1.deposit(50.0);
        checking1.deposit(30.0);
        checking1.deposit(20.0);
        checking1.deposit(10.0);
        checking1.withdraw(5.0);

        System.out.println("=== Before bank update ===");
        bank.printAllAccounts();

        bank.update();

        System.out.println("=== After bank update (interest added, fees deducted) ===");
        bank.printAllAccounts();

        bank.closeAccount(2001);

        System.out.println("=== After closing checking account #2001 ===");
        bank.printAllAccounts();
    }
}
