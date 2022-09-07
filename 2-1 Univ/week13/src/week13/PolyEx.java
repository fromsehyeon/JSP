package week13;

public class PolyEx {
	
	public static void main(String [] args) {
		ClassC  classC = new ClassC();
		InterfaceA interA = new ClassC();
		InterfaceB interB = new ClassC();
		
		
		
		
		classC.methodA();
		classC.methodB();
		
		interA.methodA();

		if(interA instanceof ClassC) {
			ClassC castA = (ClassC)interA;
			castA.methodB();
		}
		
				
		interB.methodB();
		
		if(interB instanceof ClassC) {
			ClassC castB = (ClassC)interB;
			castB.methodA();	
		}
		}

}
