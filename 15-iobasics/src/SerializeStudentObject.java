import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeStudentObject {

	public static void main(String[] args) {
		
		//serialized file is not human readable
		Student s=new Student(1,"samar");
		try (FileOutputStream fos = new FileOutputStream("students.ser");
				ObjectOutputStream out=new ObjectOutputStream(fos)){
			
			//write student object to file
			out.writeObject(s);
			
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
