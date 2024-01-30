package hw7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class HW7_3 {
		
				    public static void copyFile (String ft1 , String sd2) throws IOException {
					
					File inputfile = new File(ft1);
					File Outputfile = new File(sd2);
					
					FileReader in = new FileReader(inputfile);
					FileWriter out = new FileWriter(Outputfile);
					
					int c;
					while( (c =in.read()) != -1) {
						out.write(c);
						System.out.flush();
					}
					
					in.close();
					out.close();					
		};
	
		public static void main(String[] args) throws IOException {
			
			String ft1 = "C:\\THA105_Workspace\\HomeWork_18\\files\\IOtest2.txt";
			String sd2 = "C:\\THA105_Workspace\\HomeWork_18\\files\\NewIOtest2.txt";
			
			copyFile(ft1 , sd2);
		}
	
}
