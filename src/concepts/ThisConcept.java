package concepts;

public class ThisConcept {
	int a  = 2 ; 
	
	// this keyword refers to current class object  - scope class level 
	
	public void getData() {
		int a = 3 ; 
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		
		ThisConcept tc =   new ThisConcept();
		tc.getData();
	}

}
