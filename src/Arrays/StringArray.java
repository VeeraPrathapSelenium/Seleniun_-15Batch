package Arrays;

public class StringArray {

	public static void main(String[] args) {
		// Syntax:-String[] some variable =new String[some size];
		//All the values in an array will be stored on index values
		//When you declare	an array we must intialize the index positions with some value
		//To retrive any value from an array we must use the index position only
		
		
		//Note:-In a string array we are not supposed to store integer value.
		
		String[] strarr=new String[3];
		
		strarr[0]="Prathap";
		
		strarr[1]="Hyd";
		
		strarr[2]="Kukatpally";
		
		
		//System.out.println(strarr[0]);
		
		//To print all the value
		
		//method 1
		
		
		for(int i=0;i<=strarr.length-1;i++)
			
		{
			System.out.println(strarr[i]);
			
			
		}
		
		System.out.println("**********************************************************");
		//method2:-
		
		for (String ele : strarr) {
			
			
			
			System.out.println(ele);
		}
		
		
		
	}

}
