package Variables;

public class InstantVariables {
	
	//instance variables
	public int a=23;
	
	public int b=47;
	
	public static int c;
	
	
	
//static method
	public static void main(String[] args) {
		// Syntax to create an object
		
		//Named Object 
		
		//Classname somereference_variable=new Classname();
		
		InstantVariables ref=new InstantVariables();
		
		System.out.println(ref.a);
		
		System.out.println(ref.b);
		
		c=ref.a+ref.b;
		
		System.out.println(c);
		
		
		//Name Less object
		
		System.out.println(new  InstantVariables().a);
		
		System.out.println(new  InstantVariables().a);
		
		

	}

}
