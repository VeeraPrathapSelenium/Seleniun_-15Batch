package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		
		Set st=new HashSet();
		st.add("Prathap");
		st.add(27);
		
		st.add("Prathap");
		
		
		Iterator itr=st.iterator() ;
		
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
			
		}
		
		
		
	
		
	}

}
