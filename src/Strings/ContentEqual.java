package Strings;

public class ContentEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Source String	
	String	str="invalid Password";
	
	
	//User given string "Invalid password"
	
	
	String usergivenvalue="Invalid password";
	
	
	if(str.contentEquals(usergivenvalue))
	{
		
		
		System.out.println("Message matched");
		
	}
	
	else
		
	{
		

		System.out.println("Message not matched");
		
	}
		
		

	}

}
