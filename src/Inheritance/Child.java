package Inheritance;

public class Child extends Parent{
	
	
	
	
	
	int soncars=15;
	
	int sonhouses=90;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child prnt=new Child();
		
		
		System.out.println(prnt.housemodel);
		

		System.out.println(prnt.numberofcars);
		

		System.out.println(prnt.numberofhouses);
		
		prnt.housemodel="Duplex";
		
		System.out.println(prnt.housemodel);
		
		
		prnt.startCar();
		
		Parent p=new Child();
	
	
		
		
	}
	
	
	public void startCar()
	{
		
		System.out.println("Ford Car is starting");
		
	}
	
	public void eat()
	{
		
	}

}
