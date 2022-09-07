package week11;

public class Account {
	private int balance;
	
	public int getBalance() {
		return balance;
		
	}
	public void setBalance(int balance) {
		if (balance >= 0 && balance <= 1000000)
			this.balance = balance;
		else
			 System.out.println("잔고 설정 오류 ");
	}
}
