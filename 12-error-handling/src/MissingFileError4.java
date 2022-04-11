import java.io.*;

public class MissingFileError4 {

	public static void main(String[] args) {
		//try-with resources 
		//dont need finally clause
		//dont need to close>FileInputStream have close function inbuilt(press ctrl+rightclick to check)
		try (InputStream in=new FileInputStream("missingfile.txt")){
			System.out.println("open file");
		//code to open file
		int data=in.read();
	
		//exception should be based on checked exception first,right click>open type hierachy to view the error hierachy
	}catch(FileNotFoundException e) {
		System.out.println(e.getClass().getName());
		System.out.println("Quitting");
	}catch(IOException e) {
		System.out.println(e.getClass().getName());
		System.out.println("Quitting");
	}

}
}
