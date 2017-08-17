package ThisKeyword;

public class Thiskeyword {
	
	public  int a=10;
	
	public  int b=20;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeyword obj=new Thiskeyword();
		
		
		obj.add(23, 56);
		
		
		
		

	}

	
	
	public  void add(int a,int b)
	{	
		
		System.out.println("The addition of two numbers given by the user is "+(a+b));
		System.out.println("The class level variable a is having value"+this.a);
		System.out.println("The class level variable a is having value"+this.b);
	}
	
	
	
}
