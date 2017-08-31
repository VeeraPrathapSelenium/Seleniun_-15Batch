package StringsExamples;

public class CountThewordOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="TM has all testing tools TM has Lab Facility TM is in hydferabad";
		int flag=0;
		
		//finding with split method
		
		String[] arr=str.split("\\s");
		
		
		for (String element : arr) {
			
			if(element.equals("TM"))
			
			{
				
				flag++;
				
				
			}
			
		}
		
		if(!(flag==0))
		{
			
			System.out.println("The word TM is repeated for "+flag+" Times");
			
		}
		else
		{
			System.out.println("The word TM is not present");
			
		}
		

	}

}
