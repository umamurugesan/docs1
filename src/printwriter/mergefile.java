package printwriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class mergefile {
	
	public static void main(String args[]) throws IOException
	{
		PrintWriter wr=new PrintWriter("file3.txt");
		BufferedReader br1=new BufferedReader(new FileReader("text"));
		BufferedReader br2=new BufferedReader(new FileReader("prop.properties"));
		String str1=br1.readLine();
		String str2=br2.readLine();
		while((str1!=null)||(str2!=null))
		{
			if(str1!=null)
			{
			wr.println(str1);
			System.out.println(str1);
			str1=br1.readLine();
			
			}
			if(str2!=null)
			{
			wr.println(str2);	
			System.out.println(str2);
			 str2=br2.readLine();
			}
		}
		wr.flush();
		br1.close();
		br2.close();
		wr.close();
		
	}
	
}