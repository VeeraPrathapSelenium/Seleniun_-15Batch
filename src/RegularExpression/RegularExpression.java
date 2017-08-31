package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str="The total Estimated Tax : $ 1234567  and it i under augst renewal portin";
		
		String userpattern="Estimated Tax \\: \\$\\s*[0-9]*";

		String data=getPatternvalue(str,userpattern);
		
		System.out.println(data);
		
		
	}
	
	
	public static String getPatternvalue(String str, String userpattern)
	{
int flag=0;
		
		String val="";		
		
		String pattern=userpattern;
		
		
		Pattern ptrn=Pattern.compile(pattern);
		
		
		Matcher match =ptrn.matcher(str);
		
		
		while(match.find())
		{
			
			flag++;
			val=val+ match.group(0);
			
		}
		
		
		if(flag==0)
			
		{
			val="No pattern found";
			System.out.println("No pattern found");
			
		}
		return val;
		
		
		
	}
	
	

}
