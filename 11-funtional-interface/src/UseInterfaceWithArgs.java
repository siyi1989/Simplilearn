
public class UseInterfaceWithArgs {

	public static void main(String[]args) {
		
		//lambda expression "->"
		InterfaceWithArgs obj=(x,y)->{
			
			int result=x+y;
			System.out.println("the result is: "+result);
			
		};
		obj.calculate(10,20);
	}
	
}
