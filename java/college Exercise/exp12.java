class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;
    private double minimumBalance;

    public BankAccount(double balance, double minimumBalance) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount should be greater than zero.");
        }
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientFundException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount should be greater than zero.");
        }
        if (balance - amount < minimumBalance) {
            throw new InsufficientFundException("Insufficient funds. Cannot withdraw the requested amount.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}

public class exp12 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000.0, 1000.0);

        try {
            account.deposit(2000.0);
            account.withdraw(3000.0);
            account.withdraw(5000.0); // This will raise InsufficientFundException
            account.deposit(-1000.0); // This will raise IllegalArgumentException
        } catch (InsufficientFundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
