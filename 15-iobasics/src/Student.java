import java.io.Serializable;

public class Student implements Serializable {
//there is warning for student because there is no version ID created for serialization. 
//Version ID is to allow de-serialization of the same version of serialization.
//if Version ID during serialization is different from de-serialization, exception will occur.
	private transient int id; //when transient is added, the value will be removed during serialization
	private String name;
	
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	
	@Override
	public String toString() {
		return "id: "+id +"name: "+name;
	}
}


