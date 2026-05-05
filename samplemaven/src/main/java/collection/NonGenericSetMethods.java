package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethods {

	public static void main(String[] args) {
		Set a=new HashSet();
		a.add("Dharsana");
		a.add(23);
		System.out.println(a);
	Set b = new HashSet();
	b.add("Sudheesh");
	b.add(32);
	a.addAll(b);
	System.out.println(a);
	System.out.println(a.contains(23));
	System.out.println(a.containsAll(b));
	System.out.println(a.isEmpty());
	a.remove(32);
	System.out.println(a);
	a.removeAll(b);
	System.out.println(a);
	System.out.println(a.size());
	a.clear();
System.out.println(a);	
	
	
	
	}
}
