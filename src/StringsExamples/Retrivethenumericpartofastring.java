package StringsExamples;

public class Retrivethenumericpartofastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str="The voucher number is (1089) is sucessfully displayed";
		
		
		int pos1=str.indexOf("(")+1;
		
		
		int pos2=str.indexOf(")");
		
		String sbstr=str.substring(pos1,pos2);
		
		
		System.out.println(sbstr);
		

	}

}
