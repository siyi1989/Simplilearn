
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	public class CharStreamCopyTest {
	    public static void main(String[] args) {
	        char[] c = new char[128];
	        try
	        (
	                FileReader fr = new FileReader("filechar1");
	                FileWriter fw = new FileWriter("filechar2")
	        ) {
	            
	            int count = 0 ;
	            int read = 0;
	            while ( (read = fr.read(c)) != -1) {
	                fw.write(c);
	                count += read;
	            }
	            System.out.println("Wrote: " + count + " characters. ");
	        }catch ( FileNotFoundException f) {
	            System.out.println("File not fount" + f);
	        }catch ( IOException e) {
	            System.out.println("IOException: " + e);
	        }
	    }
	}

