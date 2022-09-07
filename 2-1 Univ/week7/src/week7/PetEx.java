package week7;

public class PetEx {
	public static void main(String[] args) {
		
		Pet dog = new Pet ("구르미", 84);
		
		System.out.println(dog.type+"는"+dog.age+"개월입니다.");
		
		
		
		dog.leg =  4;
		System.out.println(dog.type+" 다리는"+dog.leg+"개입니다.");
	}

}
