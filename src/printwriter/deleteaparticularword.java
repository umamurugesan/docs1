package printwriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class deleteaparticularword {
	public static void main(String args[]) throws IOException
	{
		File file=new File("file3.txt");
		PrintWriter wr=new PrintWriter(file);
		BufferedReader br1=new BufferedReader(new FileReader("text"));

		String str1=br1.readLine();
		while(str1!=null)
		{
			boolean flag=false;
			BufferedReader br2=new BufferedReader(new FileReader("text1"));
			String str2=br2.readLine();
			while(str2!=null)
			{
			if(str1.equals(str2))
			{
				flag=true;
				break;
			}
			str2=br2.readLine();
			}
			if(!(flag))
			{
				wr.println(str1);
			}
			str1=br1.readLine();
		}
		wr.close();
		br1.close();
		
		
	}

}
