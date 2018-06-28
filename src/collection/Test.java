package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
 
public class Test
{
    public static void main(String[] args)
    {
     /*   // Create a vector and print its contents
        Vector v = new Vector();
        for (int i = 0; i < 10; i++)
            v.addElement(i);
        System.out.println(v);
 
        // At beginning e(cursor) will point to
        // index just before the first element in v
        Enumeration e = v.elements();
 
        // Checking the next element availability
        while (e.hasMoreElements())
        {
            // moving cursor to next element
            int i = (Integer)e.nextElement();
 
            System.out.print(i + " ");
        }
        */
        List<Integer> li=new Stack<>();
        li.add(5);
        li.add(10);
        li.add(15);
       
        for (Iterator iterator = li.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
			
		}
        
    }
}
