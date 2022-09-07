package week13;

public class VolumeEx {
	public static void main(String[] args) {
		
		Radio radio = new Radio();
		TV    tv    = new TV();
		
		
		
		
		radio.volumeUp(3);
		radio.volumeDown(5);
		tv.volumeUp(6);
		tv.volumeDown(4);
		
		
		Volume[] vol = new Volume[2];
		vol[0] = radio;
		vol[1] = tv;
		
		for (int i=0; i<2; i++)
			vol[i].volumeUp(3);
	}
}
