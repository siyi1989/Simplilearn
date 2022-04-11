import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

public class DeclaringExceptions {

	//declare rule
	public static int readByteFromFile() throws IOException {
		try(InputStream in=new FileInputStream("a.txt")){
			System.out.println("File Open");
			return in.read();
			
		}
	}

	//caller
	public static void main (String[] args) {
		 try{
			 int data=readByteFromFile(); //Java error message>must enter error message
		 }catch(IOException e) {
			 System.out.println(e.getMessage());
		 }
		 
		 
	}
}
