package Filesystem;

import java.io.File;


public class FileandFoldersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\DELL\\Desktop\\Java Test\\");
		
	int filecount=0;
	
	int foldercount=0;
		
		File[] fls=f.listFiles();
		
		
		for (File file : fls) {
			
			
			if (file.isFile())
			{
				filecount++;
				
				
			
				
				System.out.println("The file name is  "+file.getName());
				
				System.out.println("The file path is  "+file.getAbsolutePath());
				
				System.out.println("The file path parent  is  "+file.getParent());
				
			}
			
			else
			{
				
				foldercount++;
			}
			
			
			
		}
		
		System.out.println("The file count is "+filecount);
		
		System.out.println("The foldercount count is "+foldercount);
		

	}

}
