package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		File f= new File("Hello.txt");
		
		try {
			FileInputStream fis=new FileInputStream(f);
		} 
		
				
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		finally
		{
			
			
		}
		
		
		
		

	}

}
