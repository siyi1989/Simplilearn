
public class UseSimpleInterface {
	public static void main (String[] args) {
		
		//old code (anonymous class)
		//SimpleInterface instance = new SimpleInterface() {
			
			//@Override
			//public void doSomething() {
			//	System.out.println("say something");
			//}
		//};
		
		//instance.doSomething();
		
		//Java 8 (Lamda Expression) replace above lines
		SimpleInterface obj=()-> System.out.println("say something--lambda");
		obj.doSomething();
		
	}
}
