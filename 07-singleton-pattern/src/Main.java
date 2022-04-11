
public class Main {

	public static void main(String[] args) {
		SingletonClass s1= SingletonClass.getInstance();
		SingletonClass s2= SingletonClass.getInstance();

		if (s1==s2) {
			System.out.println("same instance");
			
		}else {
			System.out.println("different instance");
		}
	}

}
