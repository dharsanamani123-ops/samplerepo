package inheritance;

public class HierarchicalChild1 extends HierarchicalParent{
	public void print()
	{
		System.out.println("this is the child1");
	}

	public static void main(String[] args) {
	
HierarchicalChild1 obj=new HierarchicalChild1();
obj.print();
obj.display();
	}

}
