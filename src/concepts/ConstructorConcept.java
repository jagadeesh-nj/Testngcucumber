package concepts;

public class ConstructorConcept {
	
	
	// a block of code will execute when object is created 
	// no Return type for constructor
	//it has to be class name 
	// two type -  paremeterized constructors , no args constructor 
	
	public ConstructorConcept() {
		System.out.println("i am the constructor ");
	}
	
	public ConstructorConcept(int a , String str) {
		System.out.println( a + str);
	}

	public static void main(String[] args) {
		
		ConstructorConcept cc =  new ConstructorConcept();
		ConstructorConcept cc1 =  new ConstructorConcept(25 , "hello");

	}

}
