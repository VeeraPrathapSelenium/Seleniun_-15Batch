package StringsExamples;

public class RetriveEmailAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int flag=0;
     String str="my email id is xyz@abc.com";
     
     
     String[] arr=str.split("\\s");
     
     
     for (String element : arr) {
    	 
    	 if(element.contains   ("@"))
 		{
    		 flag++;
 			System.out.println("Email exists  "+ element);
 			break;
 		}
 	
 	
	}
     
     
     if ((flag==0))
     {
    	 
    	 System.out.println("Email not exists");
    	 
     }
     
     
     
     
		
		
		
		

	}

}
