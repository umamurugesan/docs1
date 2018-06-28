package Stream;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class inputstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader i=new InputStreamReader(System.in);
	 BufferedReader bu=new BufferedReader(i);
	 float s=Float.parseFloat(bu.readLine());
	 System.out.println(s);
		

	}

}
