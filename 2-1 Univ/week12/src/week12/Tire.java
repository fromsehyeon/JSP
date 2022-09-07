package week12;

public class Tire {
	public String location;
	public int    maxRotation;
	public int    accRotation;
		
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
		
	}
	public boolean roll() {
		++accRotation;
		
		if (accRotation < maxRotation) {
			System.out.println(location+" 남은수명 : "+(maxRotation-accRotation)+"회 ");
			
			return true;
		} else {
			System.out.println("***" +location+" 타이어 펑크 ***");
			return false;
		}
	}
}
