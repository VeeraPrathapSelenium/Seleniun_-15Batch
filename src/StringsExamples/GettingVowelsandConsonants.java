package StringsExamples;

public class GettingVowelsandConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="java is a programming language";
		
		
		String vowels="";
		
		String cons="";
		
		int vwl=0;
		
		int cns=0;
		
		
		for(int i=0;i<=str.length()-1;i++)
		{
			
			
			char ch=str.charAt(i);
			
			if(ch=='a'||ch=='e'|| ch=='i' || ch=='o'|| ch=='u')
			{
				
				vowels=vowels+ch;
				vwl++;
				
				
				
			}
			else
				
			{
				
				cons=cons+ch;
				cns++;
			}
			
			
					
		}
		
		System.out.println("The total number of vowels are "+vwl+" and the vowels in the string is --->"+vowels);
		
		
		System.out.println("The total number of consonants are "+cns+" and the vowels in the string is --->"+cons);
		
		
		

	}

}
