package ExceptionHandling;

public class RaisecustomException {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		
		
		verifyAge(12);
		

	}
	
	
	
	
	public static void verifyAge(int age) throws CustomException
	{
		
		if( age<18) 
		{
			
			throw new CustomException("This is my own created exception");
			
		}
		
		
		
	}

}
