package Stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class save implements Serializable
{
 int i;	
}

public class serialdemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		save obj1=new save();
		obj1.i=23;
		 java.io.File F=new java.io.File("demo.txt");
		 FileOutputStream fo=new FileOutputStream(F);
		 ObjectOutputStream os=new ObjectOutputStream(fo);
		 os.writeObject(obj1);
		 FileInputStream fi=new FileInputStream(F);
		 ObjectInputStream dis=new ObjectInputStream(fi);
		 save obj2=(save)dis.readObject();
 System.out.println(obj2.i);
	}

}
