import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamCopyTest {
//dont need to read byte by byte
	public static void main(String[] args) {
		try( 
				BufferedReader bufInput=
					new BufferedReader( new FileReader("filelines1"));
				BufferedWriter bufOutput=
					new BufferedWriter(new FileWriter("filelines2"))
						){

			String line="";
			while((line=bufInput.readLine())!=null){
				bufOutput.write(line);
				bufOutput.newLine();
			}
			
		}catch ( FileNotFoundException f) {
            System.out.println("File not fount" + f);
        }catch ( IOException e) {
            System.out.println("IOException: " + e);
		
		

	}

}
}