package Construnctor;

public class Constructor {
	
	int a;
	
	int b;
	
	int c;
	
	static
	{
		
		System.out.println("i am a static block");
	}
	{
		
		System.out.println("i am a instance block");
	}
	
	//Constructor non parameterized
	public Constructor()
	{
		
		System.out.println("I am constructor");
		
		
	}
	
	//Constructor  parameterized
	public Constructor(int a,int b)
	{
		
	System.out.println("the value of a is "+a);		
	System.out.println("the value of b is "+b);	
	System.out.println("the value of c is "+c);	
	
	
	
	this.a=a;
	this.b=b;
	//this.c=a;
	}
	
	
	//Constructor  parameterized with 3 args
		public Constructor(int a,int b,int c)
		{
			c=a+b;
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Constructor obj=new Constructor(56,76);
	
	System.out.println("the value of a is "+obj.a);
	
	Constructor obj1=new Constructor();

	}

}
