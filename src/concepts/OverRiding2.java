package concepts;

public class OverRiding2 extends OverRiding1 {
	
	
	public void paint() {
		System.out.println("Child Paint method");
	}

	public static void main(String[] args) {
		

		OverRiding1 or1 = new OverRiding1();
		or1.paint();
		
		OverRiding2 oR2 = new OverRiding2();
		oR2.paint();
		
		OverRiding1 oR1 = new OverRiding2();
		oR1.paint();
		
		//if both the methods are Static we call Method Hiding , if We both the Methods are not Static it is Overriding
		// in method overriding runtime execution is based on runTime Object(new OverRiding1() ,  new OverRiding2())
// in method Hiding  Execution takes care by Compiler based on Reference Type
	}

}
