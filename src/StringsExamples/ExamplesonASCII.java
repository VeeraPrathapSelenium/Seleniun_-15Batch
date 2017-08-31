package StringsExamples;

public class ExamplesonASCII {

	public static void main(String[] args) {

		String str="India 123";
		
		
		String temp="";
		
		for(int i=0;i<=str.length()-1;i++)
			
		{
			char c=str.charAt(i);
			
			if((int)c>=(int)'0' && (int)c<=(int)'9' )
			
			
			{
				
				temp=temp+c;
						
				
			}
		
		}
		
		System.out.println("The numeric number is "+temp);
		

	}

}
