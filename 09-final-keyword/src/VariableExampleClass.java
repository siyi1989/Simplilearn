import java.util.Date;

public class VariableExampleClass {
	
	private final int field;
	private final Date date=new Date();
	public static final int JAVA_CONSTANT=10;
	
	VariableExampleClass(){
		field=100;
		
	}
	
	public void changeValues(final int param){
		//param=1; error because "final int param" already initialised
		date.setTime(0);
		
		//date=new Date(); -> error cause this field is final
		final int localVar;
		localVar=11;
		//localVar=23; ->error already assigned
		
				
		
	}
}
