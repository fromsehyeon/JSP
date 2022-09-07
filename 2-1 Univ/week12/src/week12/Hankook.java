package week12;

public class Hankook extends Tire {
	public Hankook(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	@Override
	public boolean roll() {
		++accRotation;
		if(accRotation < maxRotation) {
			System.out.println(location+"한국타이어 남은수명: "+(maxRotation-accRotation)+"회 ");
			return true;
		}else {
			System.out.println("***"+location+" 한국타이어 펑크 ***");
			return false;
		}
	}
}
