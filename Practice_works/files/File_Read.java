package files;



//importing the FileReader class
import java.io.FileReader;

public class File_Read {
public static void main(String[] args) {

char[] array = new char[200];

try {
 // Creates a reader using the FileReader
 FileReader input = new FileReader("demo.txt");

 // Reads characters
 input.read(array);

 System.out.println("Data in the file:");

 System.out.println(array);

 // Closes the reader
 input.close();
}
catch(Exception e) {
 e.getStackTrace();
}
}
}
