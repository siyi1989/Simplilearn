import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamCopyTest {

	public static void main(String[] args) {
		
		byte[] b=new byte [128];
		
		try(
				FileInputStream fis = new FileInputStream("file1");//create file 1 under package not under src
				FileOutputStream fos=new FileOutputStream("file2")) {//click refresh after running to see file
			System.out.println("Bytes available: "+fis.available());
			int count=0;
			int read=0;
			while((read=fis.read(b)) !=-1) {//end of file. Also can use code EOF
				fos.write(b);
				count +=read;
				
			}
			System.out.println("Wrote: "+count);
			
	}catch (FileNotFoundException f) {
		System.out.println("File not found"+f);
		
	}catch (IOException e) {
		System.out.println("IOException"+e);
	}

	}

}
