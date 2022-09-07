package week11;

public class AccountEx {
		public static void main(String [] args) {
			Account account = new Account();
			
			account.setBalance(100000);
			System.out.println("현재 잔고 : " + account.getBalance());
			
			account.setBalance(-100000);
			System.out.println("현재 잔고 : " + account.getBalance());
		}
}
