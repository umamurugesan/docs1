package ReadinngFile;

import java.io.File;

public class movefile2 {

	public static void main(String[] args)
    {
        File file = new File("D:\\File temp\\New Text Document.txt");
         
        // renaming the file and moving it to a new location
        if(file.renameTo
           (new File("D:\\practice java\\newFile.txt")))
        {
            // if file copied successfully then delete the original file
            file.delete();
            System.out.println("File moved successfully");
        }
        else
        {
            System.out.println("Failed to move the file");
        }
 
         
    }
}
