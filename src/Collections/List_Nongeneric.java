package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Nongeneric {

	public static void main(String[] args) {


		
		List lst=new ArrayList();
		
		//adding elements to the list
		lst.add("Prathap");
		
		lst.add(27);
		
		
		
		//reading each element through for loop
		
		System.out.println("*** Using For loop ***");
		
		
		//size of a list
		
		for(int i=0;i<=lst.size()-1;i++)
		{
			
			System.out.println(lst.get(i));
			
			
		}
		
		
		
		//iterator
		
System.out.println("*** Using iterator ***");
		
		
		//iterator
		
	Iterator itr=lst.iterator();
	
	
	while(itr.hasNext())
	{
		
		System.out.println(itr.next());
		
	}
		
		
		

	}

}
