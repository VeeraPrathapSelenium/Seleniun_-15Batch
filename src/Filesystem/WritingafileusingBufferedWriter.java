package Filesystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingafileusingBufferedWriter {

	public static void main(String[] args) throws IOException {


		
		File f=new File("C:\\Users\\DELL\\Desktop\\Java Test\\abc.txt");

		FileWriter fw=new FileWriter(f);

		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Hello");
		bw.newLine();
		
		bw.write(65);

		
		bw.flush();
		
		bw.close();
		
		

	}

}
