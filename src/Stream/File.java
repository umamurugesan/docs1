package Stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 java.io.File F=new java.io.File("demo.txt");
 FileOutputStream fo=new FileOutputStream(F);
 DataOutputStream dos=new DataOutputStream(fo);
 dos.writeUTF("hel");
 
 FileInputStream fi=new FileInputStream(F);
 DataInputStream dis=new DataInputStream(fi);
 String str=dis.readUTF();
 System.out.println(str);
 
	}

}
