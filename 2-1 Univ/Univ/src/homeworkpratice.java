
public class homeworkpratice {
	public static void main(String []args) {
		int [][] score = new int[][] {// [3] [5]
			{49,43,79},
			{80, 60, 62},
			{20, 85,48},
			{100, 30, 50},
			{80,90,100}
			
			};
		String[] sNames = {"A", "B", "C", "D", "E"};
		//String[] sArray = new String[5];
		
		int[] sum = new int[5];
		double[] ave = new double[5];
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[1].length; j++) {
				sum[i]+= score[i][j];
				ave[i] = (float) sum [i]/score [i].length;
				
			}
			
		}
	
	for(int i=0; i<score.length; i++) {
		System.out.print(sNames[i]+ "학생");
		
		System.out.print("총점: "+ sum[i]+"점");
		System.out.print("평균:" +ave[i]+"점 ");
		System.out.println();
	}

}
}
