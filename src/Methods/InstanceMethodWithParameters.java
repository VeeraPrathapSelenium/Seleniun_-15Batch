package Methods;

public class InstanceMethodWithParameters {
	
	public String name="Prathap";
	
	public int age=27;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		InstanceMethodWithParameters obj=new InstanceMethodWithParameters();
		
		
		int res=obj.add(45, 78);
		
		
		System.out.println("The addition of two numers is "+res);
		
		
	}

	
	public  int add(int a,int b)
	{
		
		
		int c=a+b;
		
		//System.out.println("The addition of two numbers is"+c);
		
		return c;
		
		//System.out.println("The addition of two numbers is"+c);
		
	}
	
	
	
	
	
	
	
}
