import java.io.*;

public class MissingFileError2 {

	public static void main(String[] args) {
	
		try {
			System.out.println("About to open file");
		//code to open file
		InputStream in=new FileInputStream("missingfile.txt");
		System.out.println("File open");
		int data=in.read();
		in.close();
	
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
