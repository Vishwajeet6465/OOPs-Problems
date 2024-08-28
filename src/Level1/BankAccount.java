package Level1;

public class BankAccount {
	double balance;
	String accNumber;
	
	public BankAccount(double balance, String accNumber) {
		this.balance = balance;
		this.accNumber = accNumber;
	}
	
	public void deposite(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposited Amount: "+ amount);
			System.out.println("New Account Balance: "+ balance);
		}else {
			System.out.println("Amount must be positive.");
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0) {
			if(amount < balance) {
				balance -= amount;
				System.out.println("Withdrawal Amount: "+ amount);
				System.out.println("New Account Balance: "+ balance);
			}else {
				System.out.println("InSufficient Funds.");
			}
		}else {
			System.out.println("Amount must be positive.");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getAccountNumber() {
		return accNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc = new BankAccount(2000.0, "2565365625");
		
		System.out.println("Account Number: "+ acc.getAccountNumber());
		System.out.println("Account Balance: "+ acc.getBalance());
		
		acc.deposite(500.0);
		
		acc.withdraw(1000.0);
		
		acc.withdraw(5000.0);
		
		System.out.println("Final balance: "+ acc.getBalance());
	}

}
