package week14;

public class WaitNotifyExample {
	public static void main (String [ ]args) {
		DataBox dataBox = new DataBox();
	
		
		
		
		ProducerThread proThread = new ProducerThread(dataBox);
		ConsumerThread conThread = new ConsumerThread(dataBox);
		
		proThread.start();
		conThread.start();
		
	
	}

}
