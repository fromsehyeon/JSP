
public class Account {
	private String accNo;
	private String owner;
	private int balance;
	
	public Account(String accNo,String owner, int balance) {
		this.accNo = accNo;
		this.owner = owner;
		this.balance = balance;
	}
	public String getaccNO() {
		return accNo;
		
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	
	public String getOwner() {
		return owner;
		
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
		
}
