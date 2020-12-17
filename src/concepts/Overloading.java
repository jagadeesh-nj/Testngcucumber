package concepts;


//Overloading -  Either the no of Arguments should be different / data type of Arguments should be different 

public class Overloading {
	
	public void getData(int a) {
		System.out.println(a);
		
	}

    public void getData(String a) {
    	System.out.println(a);
	}

	public static void main(String[] args) {
	
		Overloading oa = new Overloading();
		oa.getData(2);
		oa.getData("hello");
	}

}
