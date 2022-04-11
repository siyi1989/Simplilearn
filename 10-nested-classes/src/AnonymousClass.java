
public class AnonymousClass {

	public static void main(String[] args) {
		new OClass().print();

	}

}

class OClass{
	public void print() {
		final String s="test: ";
		//anonymous class begins here
		System.out.println(new Object(){
			private int x=1;
			private int y=2;
			
			public String toString() {
				return s+"("+x+" ,"+y+")";
			}
			
		});
		//anonymous class begins ends here
	}
}