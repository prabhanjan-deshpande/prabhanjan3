package windowHandleExample;

public class ThisSuperExample extends Superclass{

	// overrides printMethod in Superclass
	public void printMethod() {
		System.out.println("Printed in Subclass");
		super.printMethod();
	}
	public static void main(String[] args) {
		ThisSuperExample s = new ThisSuperExample();
		s.printMethod();    
	}
}

class Superclass {

	public void printMethod() {
		System.out.println("Printed in Superclass.");
	}
}
