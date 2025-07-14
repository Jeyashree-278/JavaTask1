package javatask3;

public class Account {
	int totalAmount=0;
	int accountNumber;
	String accountType;
	
	public Account() {
		System.out.println("Its a Account class Default constructor");
		
	}
	public Account(int accountNumber,String accountType) {
		this.accountNumber=accountNumber;
		this.accountType=accountType;
	}
	public void withDraw(int wamt)
	{
		totalAmount-=wamt;
		System.out.println("The withdrawn amount: "+wamt);
		
	}
	public void deposit(int damt)
	{
		totalAmount+=damt;
		System.out.println("The credited amount: "+damt);
	}
	public void checkBalance()
	{
		System.out.println("The Available balance "+totalAmount);
	}

	public static void main(String[] args) {
		Account a=new Account();
		Account a1=new Account(1001,"Savings");
		a1.deposit(1000);
		a1.withDraw(200);
		a1.checkBalance();
	}

}
