package ConditionalStatements;

public class NestedIf {

	public static void main(String[] args) {

		
		int a=197;

		int b=109;



		if(a>b)
		{
			
			if(a>=150 && a<=200)
			{
				
				System.out.println("A is greater than B and it is in the range of 150 and 200");
				
			}
			else
			{
				
				System.out.println("A is greater than B and but it is not in the range of 150 and 200");
			}
			
		}
		else
		{
			
			System.out.println("A is not greater than B");
			
		}
		

	}

}
