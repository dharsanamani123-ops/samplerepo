package inheritance;

public class MultipleInheritanceChild implements MultipleInheritanceParent1, MultipleInheritanceParent2 {
public void show()
{
	System.out.println("hihi");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritanceChild obj = new MultipleInheritanceChild();
		obj.display();
		obj.print();
		obj.show();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("hi dharsana");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("how r u");
	}

}
