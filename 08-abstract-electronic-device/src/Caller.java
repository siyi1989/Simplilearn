
public class Caller {

	public static void main(String[] args) {
		//ElectronicDevice dev=new ElectronicDevice();-->error due to abstract class ElectronicDevice
		ElectronicDevice dev=new Television();
		dev.turnOn();
		
		
		

	}

}
