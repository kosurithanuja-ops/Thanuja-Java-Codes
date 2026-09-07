package CIET;
class BankAccount{
	private double balance;
	double getBalance() {
		return balance;
	}
	public void deposit(double amount){
		if(amount>0) {
			balance+=amount; //balance=balance+amount
		}
		else
		{
			System.out.println("Invalid amount");
		}
	}
}

public class Encapsulation2 {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.deposit(50000);
		System.out.println(account.getBalance());
		
		
	}

}
