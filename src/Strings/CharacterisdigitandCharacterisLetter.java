package Strings;

public class CharacterisdigitandCharacterisLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter=0;
		String str="Hello InDiA";
		
		for(int i=0;i<=str.length()-1;i++)
		{
				
			char c=str.toUpperCase().charAt(i);
			
			
			if(Character.isDigit(c))
			
			{
				
				counter++;
				
				
			}
			
			
		}
		
		
		if(!(counter==0))
		{
			
			System.out.println(" The string contains total number of numerics is "+counter);
			
			
		}
		else
		{
			System.out.println(" The string contains no numerics ");
			
		}
		

	}

}
