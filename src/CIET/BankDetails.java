package CIET;
class BankAccount{
	private String accountHolder;
	private int accountNumber;
	private double balance;
	BankAccount(String accountHolder,int accountNumber,double balance){
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
		
	}
	void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println(amount);
			
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
	 void withdraw(double amount){
		if(amount<=0) {
			System.out.println("Invalid withdrawal amount");
		}
		else if(amount>=balance) {
			balance=balance-amount;
			System.out.println(amount+"withdraw successfull");
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	 }
		 void displayBalance(){
			System.out.println("\n --- Account holder details");
			System.out.println(accountHolder);
			System.out.println(accountNumber);
			System.out.println(balance);
			
			
		}
	}


public class BankDetails {
	public static void main(String[] args) {
		BankAccount account=new BankAccount("chandan",1234567890,5000);
		account.displayBalance();
		account.deposit(2000);
		account.displayBalance();
		account.withdraw(1500);
		account.displayBalance();
		account.withdraw(10000);
		
		
	}

}
