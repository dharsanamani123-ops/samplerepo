package superkeyword;

public class SuperMethodChild extends SuperMethodParent {
public void show()
{
	System.out.println("ChildMethod");
	super.display();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SuperMethodChild obj=new SuperMethodChild();
		 obj.show();
				 
	}

}
