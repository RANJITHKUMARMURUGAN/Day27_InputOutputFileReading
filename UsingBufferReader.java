package File_read_write_File_InoutStram_File_outputStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferReader {
	public static void main(String[] args) {
		File file = new File("D:\\MyFolder\\abc.txt");
		boolean result=file.exists();
		try {
			file.createNewFile();
			FileWriter fwriter=new FileWriter(file);
			BufferedWriter bwriter = new BufferedWriter(fwriter); // same but using BufferedWriter
			bwriter.write("Tamil");
			bwriter.newLine(); // next new Line
			bwriter.write("English");
			bwriter.newLine(); // next new Line
			bwriter.write("Maths");
			bwriter.newLine(); // next new Line
			bwriter.write("Science");
			bwriter.newLine(); // next new Line
			bwriter.write("SocialScience");
			bwriter.flush();
			bwriter.close();
			FileReader freader = new FileReader(file);
			BufferedReader breader = new BufferedReader(freader);
			String bufferReader = breader.readLine();
			int lineCount=0;
			while(bufferReader!=null) {
				lineCount++;// how many Line will be count
				System.out.println(bufferReader);
				bufferReader=breader.readLine();
			}
			System.out.println("The Total number of count is"+" = "+lineCount);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
