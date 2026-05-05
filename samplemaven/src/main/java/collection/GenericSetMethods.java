package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String>a=new HashSet<String>();
a.add("one");
a.add("three");
a.add("four");
System.out.println(a);
Set<String>b=new HashSet<String>();
b.add("yellow");
b.add("pink");
a.addAll(b);
System.out.println(a);
System.out.println(a.contains("four"));
System.out.println(a.containsAll(b));
System.out.println(a.isEmpty());
a.remove("one");
System.out.println(a);
a.removeAll(b);
System.out.println(a);
System.out.println(a.size());
a.clear();
System.out.println(a);



}

}
