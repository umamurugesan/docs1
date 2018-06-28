package ReadinngFile;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws IOException
    {
        // creating a new file instance
        File file = new File("prop.properties");
         
        // check if file exists
        boolean exists = file.exists();
        if(exists == true)
        {
            // changing the file permissions
            file.setExecutable(true);
          boolean read=  file.setReadable(true);
            file.setWritable(true);
            System.out.println("File permissions changed."+read);
 
            // printing the permissions associated with the file currently
            System.out.println("Executable: " + file.canExecute());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: "+ file.canWrite());
        
          	    try {
				
					
       	  
					BufferedWriter out = new BufferedWriter(
			                   new FileWriter(file, true));
			            out.write("hello");
			            out.close();
			            
			        	Scanner sc = new Scanner(file);

						while (sc.hasNextLine())
						{
						  System.out.println(sc.nextLine());
						}
						
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			

             
        }
        else
        {
            System.out.println("File not found.");
        }
    }

}
