package abstraction;

public class AbstractionChild extends AbstractionParent {

	public static void main(String[] args) {
		AbstractionChild obj = new AbstractionChild();
		obj.display();
		obj.print();

	}
// click error in abstraction child then we will get display method
	@Override
	public void display() {
		System.out.println("HELLO DHARSANA");
		
	}

}
