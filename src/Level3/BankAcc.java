package Level3;

class BankAccount {
    private double balance;
    private int accountNumber;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public class Interest {
        private double interestRate;

        public Interest(double interestRate) {
            this.interestRate = interestRate;
        }

        public void calculateInterest() {
            double interestAmount = balance * (interestRate / 100);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
            System.out.println("Interest Rate: " + interestRate + "%");
            System.out.println("Interest Amount: " + interestAmount);
            System.out.println("New Balance: " + (balance + interestAmount));
        }
    }

    public Interest createInterestObject(double interestRate) {
        return new Interest(interestRate);
    }
}

public class BankAcc {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(12345, 10000.0);
        BankAccount.Interest interest = bankAccount.createInterestObject(5.0);
        interest.calculateInterest();
    }
}