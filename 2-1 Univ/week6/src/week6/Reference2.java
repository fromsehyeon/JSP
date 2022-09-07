package week6;

public class Reference2 {
	public static void main(String[] args) {
		//자바는 문자열 리터널이 동일하다면 String 객체를 공유한다.
		String sVaI1 = "Java";
		String sVaI2 = "Java";
		System.out.println("sVaI1==sVaI2:" +(sVaI1==sVaI2?"참조가 같음":"참조가 다름 "));
		
		//new 연산사를 이용하는 경우에는 힙 영역에 새로운 String 객체가 생성된다
		
	}

}
