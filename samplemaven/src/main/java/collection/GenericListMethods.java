package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <String>a=new ArrayList <String>();
a.add("Apple");
a.add("Banana");
a.add("Pineapple");
a.add("Apple");
a.add("Grapes");
System.out.println(a);
System.out.println(a.get(3));
a.set(2, "Orange");
System.out.println(a);
System.out.println(a.indexOf("Banana"));
System.out.println(a.lastIndexOf("Apple"));
a.remove(3);
System.out.println(a);
System.out.println(a.contains("Watermelon"));
System.out.println(a.isEmpty());
System.out.println(a.size());
	}

}
