package geeksforgeeksfile;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) throws IOException
    {
        // Accept a string
		String str = "File Handling in Java using "+
                " FileWriter and FileReader";
 
        // attach a file to FileWriter
        FileWriter fw=new FileWriter("text");
 
        // read character wise from string and write
        // into FileWriter
        fw.write(str,2,10);
 
        //close the file
        fw.close();
    }

}
