package Filesystem;

import java.io.File;
import java.io.IOException;

public class FileExistance {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
File f=new File("C:\\Users\\DELL\\Desktop\\Java Test\\abc.txt");
		
		
	if(f.exists())
	{
		
		System.out.println("File Exists");
		
	}
	
	else
	{
		System.out.println("File not Exists");
		f.createNewFile();
	}
		
		

	}

}
