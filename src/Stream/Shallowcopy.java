package Stream;

class Abc
{
 int i;
 int j;
@Override
public String toString() {
	return "Abc [i=" + i + ", j=" + j + "]";
}
 
}

public class Shallowcopy {
	public static void main(String args[])
	{
		Abc obj1=new Abc();
		obj1.i=5;
		obj1.j=10;
		Abc obj2=new Abc();
		obj2.i=obj1.i;
		obj2.j=obj1.j;
		System.out.println("obj2"+obj2);
		System.out.println("obj1"+obj1);
		//change obj1 value
		obj1.i=20;
		System.out.println("change obj1 value");
		System.out.println("obj2"+obj2);
		System.out.println("obj1"+obj1);
		//change obj2 value
		obj2.i=2000;
		System.out.println("change obj2 value");
		System.out.println("obj2"+obj2);
		System.out.println("obj1"+obj1);
	}

}
