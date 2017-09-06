package Filesystem;

import java.io.File;
import java.io.IOException;

public class Deletingafile {

	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\DELL\\Desktop\\Java Test\\abc.txt");
		
		
		if(f.exists())
		{
			
			System.out.println("File Exists");
			
			f.delete();
			
		}
		
		else
		{
			System.out.println("File not Exists");
			f.createNewFile();
		}
			
			

		}

	

}
