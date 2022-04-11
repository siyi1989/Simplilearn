
public class SingletonClass {

	public static final SingletonClass instance =new SingletonClass();
	
	// rule 1: make constructor private
	private SingletonClass() {
		
	}

	//rule 2 : 
	public static SingletonClass getInstance() {
		return instance;
		
	}
	}


