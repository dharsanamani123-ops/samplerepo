package polymorphism;

public class PolymorphismChild extends PolymorphismParent{
public void display()
{
	System.out.println("this is the child class");
	super.display();
}
	public static void main(String[] args) {
		PolymorphismChild obj=new PolymorphismChild();
		obj.display();
		

	}

}
