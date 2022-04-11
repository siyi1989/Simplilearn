import java.io.FileNotFoundException;

public class DemoThrowsException {

	public static void readFile(String file) throws FileNotFoundException {
		boolean found=findFile(file);
		
		if(!found) {
			throw new FileNotFoundException("Missing file");
			
		}
	}
	
	private static boolean findFile(String file) {
		return false;
	}
	
	public static void main(String[] args) {
		try {
			readFile("missingfile.txt");
		} catch (FileNotFoundException e) {
			System.out.println("FNF");
		}
	}
}
