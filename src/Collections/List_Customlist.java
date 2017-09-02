package Collections;

import java.util.ArrayList;
import java.util.List;

public class List_Customlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CustomList clst=new CustomList();
		
		List<CustomList> custlist=new ArrayList<CustomList>();
		
		
		clst.Age=123;
		clst.empid=234;
		
		clst.Location="Hyderabad";
		
		clst.name="Prathap";
		
		
		//add the class object to the list
		
		custlist.add(clst);
		
		
		
		for(int i=0;i<=custlist.size()-1;i++)
			
		{
			
			
			System.out.println(custlist.get(i).Age);
			System.out.println(custlist.get(i).empid);
			System.out.println(custlist.get(i).Location);
			System.out.println(custlist.get(i).name);
			
		}
		
		
		custlist.clear();
		
for(int i=0;i<=custlist.size()-1;i++)
			
		{
			
			
			System.out.println(custlist.get(i).Age);
			System.out.println(custlist.get(i).empid);
			System.out.println(custlist.get(i).Location);
			System.out.println(custlist.get(i).name);
			
		}
		
custlist.remove(0);

		

	}

}
