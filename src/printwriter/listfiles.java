package printwriter;

import java.io.File;

public class listfiles {
	public static void main(String args[])
	{
		File F=new File("D:\\practice java\\restaurant system");
	File[] file=F.listFiles();
		for (int i = 0; i < file.length; i++) {
			
				 listdir(file[i]);
			
		}
		
	}
	public static void listdir(File file)
	{
		 if(file.isFile())
			 System.out.println("filename="+file);
		 else if(file.isDirectory())
		 {
			  System.out.println("directoryname"+file);
			  File[] Ffun=file.listFiles();
			  if(Ffun.length==0)
				  System.out.println("empy");
			 for (int i = 0; i < Ffun.length; i++) {
				listdir(Ffun[i]);
			}
			
	}

}
}
