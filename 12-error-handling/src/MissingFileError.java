import java.io.*;

public class MissingFileError {

	public static void main(String[] args) {
	
		try {
			System.out.println("About to open file");
		//code to open file
		InputStream in=new FileInputStream("missingfile.txt");
		System.out.println("File open");
	}catch(Exception e) {
		System.out.println("something went wrong!");
	}

}
}
