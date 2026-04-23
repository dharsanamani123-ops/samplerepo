package inheritance;

public class HierarchicalChild2 extends HierarchicalParent{
	public void show()
	{
		System.out.println("this is child 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalChild2 obj1=new HierarchicalChild2();
		obj1.display();
		obj1.show();
	}

}
