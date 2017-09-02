package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {

		
		Map mp=new HashMap();
		
		mp.put(1, "Prathap");
		
		mp.put(2, "Hyderabad");
		
		
	for(int i=1;i<=mp.size();i++)
	{
		
		System.out.println(mp.get(i));
		
	}
		

	}

}
