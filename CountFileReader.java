package File_read_write_File_InoutStram_File_outputStream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CountFileReader {
	public static void main(String[] args) {
		File file = new File("D:\\MyFolder\\Test.txt");
		boolean result=file.exists();
		try {
			file.createNewFile();
			//System.out.println(result);
			FileWriter writer = new FileWriter(file); // FileWrite class Object //
			writer.write("Hi How Are You..!");
			writer.flush(); // should do
			writer.close();// should do
			FileReader filereader = new FileReader(file); // FileReader print here //
			int output=filereader.read(); // if data is there into the file the values not -1 . 
			while(output!=-1) {    
				System.out.print((char)output);// typeCasting so print the output in word// if NOT data anything in file then the values is -1.
				output=filereader.read();
			}
			
			char ch[] = new char[(int)file.length()];
			System.out.println("\n"+ch.length);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
