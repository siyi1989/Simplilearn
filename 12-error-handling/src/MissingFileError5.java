import java.io.*;

public class MissingFileError5 {

	public static void main(String[] args) {
		//try-with resources 
		//dont need finally clause
		//dont need to close
		try (InputStream in=new FileInputStream("missingfile.txt")){
			
			Class.forName("driver");//ClasNotFoundException
			System.out.println("open file");
		//code to open file
			int data=in.read();
	
		//Multiple exception can be handled using | bar
	}catch(ClassNotFoundException | IOException e) {
		System.out.println(e.getClass().getName());
		System.out.println("Quitting");
	}catch(IOException e) {
		System.out.println(e.getClass().getName());
		System.out.println("Quitting");
	}

}
}
