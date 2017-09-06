package ExceptionHandling;

public class UncheckedException_TryCatchBlocks {

	public static void main(String[] args) {
		
		int flag=0;
		
		try
		{
			div();
			
		}
		
		catch(ArithmeticException a1)
		{
			System.out.println(" i am arthimatic Exception");
			
		}
		
		
		
		catch(Exception e)
		{
			
			System.out.println("Errror is available"+e);
			
			
		}
		
		
		finally
		{
			
			//This block will execute if there is exception occur or not
			
			System.out.println("i am from finally block");
		}
		
		
	}
	
	
	public static void div()
	{
	
		System.out.println(10/0);
		
	}
	
	
	

}
