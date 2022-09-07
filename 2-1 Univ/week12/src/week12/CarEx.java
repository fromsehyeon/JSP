package week12;

public class CarEx {
	public static void main(String [] args) {
		Car car= new Car();
		for (int i = 0; i <= 10; i++) {
			int flat = car.run();
			if(flat == 1) {
				System.out.println("한국어타이어로 교체 ");
				car.frontLeft = new Hankook("앞왼쪽 ", 15);
			
			} else if (flat == 2) {
				System.out.println("한국타이어로 교체 ");
				car.frontRight = new Hankook("앞오른쪽 ", 15);
			}
			System.out.println("-------------------");
		}
	}

}
