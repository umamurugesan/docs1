package practise;

import java.lang.reflect.Method;

public class Meta {

	
	@MyAnno(str = "Two Parameters", val = 19)
	public static void myMeth(String str, int i)
	{
	Meta ob = new Meta();
	// Obtain the annotation for this method
	// and display the values of the members.
	try {// First, get a Class object that represents
		// this class.
	Class<Meta> c=(Class<Meta>) ob.getClass();
		// Now, get a Method object that represents
		// this method.
	Method m = c.getMethod("myMeth", String.class, int.class);
		// Next, get the annotation for this class.
		MyAnno anno = m.getAnnotation(MyAnno.class);
		// Finally, display the values.
		System.out.println(anno.str() + " " + anno.val());
		} catch (NoSuchMethodException exc) {
		System.out.println("Method Not Found.");
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myMeth("test", 10);

	}

}
