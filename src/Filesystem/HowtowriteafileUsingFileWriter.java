package Filesystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HowtowriteafileUsingFileWriter{

	public static void main(String[] args) throws IOException {

File f=new File("C:\\Users\\DELL\\Desktop\\Java Test\\abc.txt");

FileWriter fw=new FileWriter(f);


fw.write("Hello");

fw.write(65);



fw.flush();

fw.close();




		
		

	}

}
