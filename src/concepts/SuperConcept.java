package concepts;

public class SuperConcept extends SuperConceptParent{

	// super is a keyword which will call the parent class methods  
	// it brings the value from parent level 
	
	
	String name  = "royal" ; 
	
	public void getName() {
		System.out.println(super.name);
		System.out.println(name);
	}
	
	
	public void getdata() {
		super.getdata();
		System.out.println("i am child class");
	}
	
	
	
public 	SuperConcept(){
		super();
		System.out.println("child class constructor ");
	}
	
	
	public static void main(String[] args) {
		
		SuperConcept sc  =  new SuperConcept();
		sc.getName();
		sc.getdata();
		

	}

}
