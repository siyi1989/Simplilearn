
public class MemberClass {

	public static void main(String[]args) {
		//1st method
		//OC a = new OC();
		//OC.IC b=a.new IC();
		//b.print();
		
		//2nd method
		new OC().new IC().print();
		
	}
	}

//outer class
class OC{
	private int x=1;//data
	
	//member class
	public class IC{
		
		private int y =2;
		
		public void print() {
			System.out.println("x="+x+" y="+y);
			
		}
	}
}

