package concepts;

//Method Hiding  = if we define same static method in super class and sub class 
//if both the methods are Static we call Method Hiding , if We both the Methods are not Static it is Overriding
//in method Hiding  Execution takes care by Compiler based on Reference Type

public class OmethodHiding extends OverRiding1{
	
	public static void paintHiding() {
		System.out.println("Child paint methodHiding");
	}
	
	public static void main(String[] args) {
		
		
		OverRiding1 orm	= new OmethodHiding();
		orm.paintHiding();  // calling the parent class static overridden method is called Method Hiding
		//generally if it is overriden concept  here we should see child class method  
	}

}
