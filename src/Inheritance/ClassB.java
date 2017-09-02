package Inheritance;

public class ClassB extends ClassA {
	
	
	public ClassB()
	{
		super("RAJ");
			}
	
	public ClassB(int a,int b)
	{
		
		System.out.println("The addition of two numbers is "+(a+b));
		
	}
	
	
	

	public static void main(String[] args) {
		
		ClassB b=new ClassB();
		ClassB b1=new ClassB(2,6);
	}
	
	

	
	

}
