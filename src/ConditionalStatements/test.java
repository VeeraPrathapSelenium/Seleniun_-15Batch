package ConditionalStatements;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String str="3|texas|1|1|1";
	String id=str.substring(0, 1);
	String rp=str.replaceAll("(^\\D)|(\\|)|(\\d)", "");
	
	System.out.format("%-5s%s\n","Id","Name");
	System.out.print(id);
	System.out.format("%-4s%s","","");
	System.out.print(rp);
		
		
		

	}

}
