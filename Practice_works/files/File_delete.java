package files;

import java.io.File;

public class File_delete {

	public static void main(String[] args) {
//		creates a file object
		File file = new File("demo.txt");
		
//		deletes the file
		boolean value = file.delete();
		if(value) {
			System.out.println("The File is deleted.");
			
		}
		else {
			System.out.println("The file is not deleted.");
		}
	}
}
	

		

	
	

