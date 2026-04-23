package inheritance;

public class MultiLevelChild extends MultiLevelParent{
public void show()
{
	System.out.println("This is the child");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultiLevelChild obj=new MultiLevelChild();
obj.display();
obj.print();
obj.show();
	}

}
