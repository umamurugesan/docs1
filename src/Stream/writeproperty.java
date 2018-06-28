package Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.io.OutputStream;
import java.util.Properties;

public class writeproperty {
  public static void main(String args[]) throws IOException
  {
	  Properties pr=new Properties();
	  OutputStream os=new FileOutputStream("prop.properties");
	  //set the properties
	  pr.setProperty("name", "uma");
	  pr.setProperty("passwordd", "131191");
	  pr.setProperty("state", "tn");
	  
	  //good is comment and store is used to pust teh value
	  pr.store(os, "good");
	  
	  //Read teh properties file
	  Properties pr1=new Properties();
	  InputStream is=new FileInputStream("prop.properties");
	  pr1.load(is);
	  System.out.println(pr1.getProperty("name"));
	  pr1.list(System.out);
  }
	
}
