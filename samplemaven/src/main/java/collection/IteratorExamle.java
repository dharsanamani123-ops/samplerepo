package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExamle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String>a=new HashSet<String>();
a.add("red");
a.add("yellow");
a.add("violet");
a.add("green");
System.out.println(a);
Iterator i=a.iterator();
while(i.hasNext()) // check if next element is present
{
	System.out.println(i.next());
}
i.remove();// To remove last element
System.out.println(a);
	}

}
