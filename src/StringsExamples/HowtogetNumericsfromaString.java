package StringsExamples;

public class HowtogetNumericsfromaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter=0;
		
		String Raj="";
		String str="Hello InDiA 123";
		
		for(int i=0;i<=str.length()-1;i++)
		{
				
			char c=str.toUpperCase().charAt(i);
			
			
			if(Character.isDigit(c))
			
			{
				
				counter++;
				Raj=Raj+c;
				
			}
			
			
		}
		
		
		if(!(counter==0))
		{
			
			System.out.println(" The string contains total number of numerics is "+counter);
			System.out.println(Raj);
			
		}
		else
		{
			System.out.println(" The string contains no numerics ");
			
		}
		

	}

}
