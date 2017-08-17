package ThisKeyword;

public class LocalVariableExample {
	
	
	public int a;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(new LocalVariableExample().a );
		
		new LocalVariableExample().add(10);
		
		System.out.println(new LocalVariableExample().a );
	}
	
	
	
	public  void add(int a)
	{	
		
		System.out.println("The variable given by the user is "+a);
		System.out.println("The class level variable a is having value"+this.a);
		this.a=a;
		
	}
	
	
	
	
	

}
