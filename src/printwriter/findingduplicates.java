package printwriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import Stream.File;

public class findingduplicates {
	public static void main(String args[]) throws IOException
	{
		java.io.File f=new java.io.File("output.txt");
		PrintWriter wr=new PrintWriter(f);
		BufferedReader bri=new BufferedReader(new FileReader("text1"));
		
		String stri,stro;
		while( (stri=(bri.readLine()))!=null)
		{
			boolean flag=false;
			BufferedReader bro=new BufferedReader(new FileReader(f));
			while((stro=bro.readLine())!=null)
			{
			  if(stro.equals(stri))	
			  {
				  flag=true;
				  break;
			  }
			 
			
			}
			if(!(flag))
			{
				wr.println(stri);
				wr.flush();
			}
		}
		
	}

}
