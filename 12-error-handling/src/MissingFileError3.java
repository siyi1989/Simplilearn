import java.io.*;

public class MissingFileError3 {

	public static void main(String[] args) {
		InputStream in=null;
		try {
			System.out.println("About to open file");
		//code to open file
		InputStream in=new FileInputStream("missingfile.txt");//click ctrl+right click to view this function.
		//FileinputStream have close function already inbuilt
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
	}finally {
		try {
			if (in!=null) in.close();
		}catch(IOException e) {
			System.out.println("Failed to close file");
		}
	}

}
}
