

//concrete subclass
public class Television extends ElectronicDevice {

	public void turnOn() {
		//implementation
		changeChannel(1);
		initializeScreen();
	}
	
	public void turnOff() {
		//implementation
		
	}
	
	public void changeChannel(int channel) {
		System.out.println("Channel no:"+channel);
	}
	
	public void initializeScreen() {
		System.out.println("Simplilearn");
	}
}

