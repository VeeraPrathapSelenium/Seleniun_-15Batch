package Filesystem;

import java.io.File;

public class Deletingafolder {

	public static void main(String[] args) {
		
		
		
		
File f=new File("C:\\Users\\DELL\\Desktop\\Java Test\\FileHandling");
		
		
	if(f.exists())
	{
		
		f.deleteOnExit();
	}

	}

}
