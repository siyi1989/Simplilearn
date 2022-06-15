import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeStudentObject {

	public static void main(String[] args) {
		
		Student s=null;
		
		try(FileInputStream fis =new FileInputStream("students.ser");
				ObjectInputStream in= new ObjectInputStream(fis)){
			s=(Student) in.readObject();
			
			System.out.println(s);
			
		}catch (ClassNotFoundException|IOException e) {
			e.printStackTrace();
	}

}
}
