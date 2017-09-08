package Filesystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HowtowriteafileusingPrintWriter {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\DELL\\Desktop\\UIPAth_Weekend\\abc.txt");
		
		
		FileWriter fw=new FileWriter(f);
		
		
		PrintWriter pw=new PrintWriter(fw);
		
		
		for(int i=0;i<=5;i++)
		{
			pw.println("Hello i am writing line no "+i);
		}
		

		pw.flush();
		
		pw.close();
		
		
		
		
		
		
		
		

	}

}
