package Stream;

class bcd  implements Cloneable
{
 int i;
 int j;
@Override
public String toString() {
	return "bcd [i=" + i + ", j=" + j + "]";
}

 public Object clone() throws CloneNotSupportedException
 {
	 return super.clone();
 }
}

public class Clone {
	public static void main(String args[]) throws CloneNotSupportedException
	{
	bcd obj1=new bcd();
	obj1.i=5;
	obj1.j=6;
	bcd obj2=new bcd();
	obj2=(bcd)obj1.clone();
	System.out.println("obj1:"+obj1);
	System.out.println("obj2"+obj2);
	obj2.i=20;
	System.out.println("after change in obj2");
	System.out.println("obj1:"+obj1);
	System.out.println("obj2"+obj2);
	}

}
