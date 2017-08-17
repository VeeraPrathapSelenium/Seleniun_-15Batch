package Methods;

public class StaticMethodWithParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int res=StaticMethodWithParameters.add(23, 67);
		
		System.out.println("The addition of two numbers is"+res);
		
		
int res2=StaticMethodWithParameters.add(45, 78);
		
		System.out.println("The addition of two numbers is"+res2);
		
	}
	
	
	public static int add(int a,int b)
	{
		
		
		int c=a+b;
		
		//System.out.println("The addition of two numbers is"+c);
		
		return c;
		
		//System.out.println("The addition of two numbers is"+c);
		
	}
	
	public static int sub(int a,int b)
	{
		
		
		int c=a-b;
		
		//System.out.println("The addition of two numbers is"+c);
		
		return c;
		
		//System.out.println("The addition of two numbers is"+c);
		
	}
	
	
	
	
	
	
	

}
