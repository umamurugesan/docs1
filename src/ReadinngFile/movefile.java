package ReadinngFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class movefile {
	
	public static void main(String[] args) throws IOException
    {
        Path temp = Files.move
        (Paths.get("D:\\File temp\\first.txt"), 
        Paths.get("D:\\practice java\\practise\\first1.txt"));
 System.out.println(temp);
        if(temp != null)
        {
            System.out.println("File renamed and moved successfully");
        }
        else
        {
            System.out.println("Failed to move the file");
        }
    }

}
