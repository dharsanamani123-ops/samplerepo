package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericListMethods {

	public static void main(String[] args) {
	List a = new ArrayList();
	a.add("Palakkad");
	a.add("Thrissur");
	a.add("Idukki");
	a.add(1);
	System.out.println(a);
	System.out.println(a.get(2));
	a.set(1, "Kollam");
	System.out.println(a);
	System.out.println(a.indexOf("Kollam"));
	System.out.println(a.lastIndexOf("Palakkad"));
	a.remove("Kollam");
	System.out.println(a);
	System.out.println(a.contains("Kollam"));
	System.out.println(a.isEmpty());
	System.out.println(a.size());

	}

}
