package ReadinngFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class src2dest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 /* If file doesnot exist FileInputStream throws
        FileNotFoundException and read() write() throws
        IOException if I/O error occurs */
		   
     FileInputStream fis = new FileInputStream("text");

     /* assuming that the file exists and need not to be
        checked */
     FileOutputStream fos = new FileOutputStream("text1");

     int b;
     while  ((b=fis.read()) != -1)
         fos.write(b);

     /* read() will readonly next int so we used while
        loop here in order to read upto end of file and
        keep writing the read int into dest file */
     fis.close();
     fos.close();

	}

}
