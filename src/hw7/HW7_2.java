package hw7;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class HW7_2 {
	
	public static void main(String[] args) {
			
				File outputFile = new File("C:\\THA105_Workspace\\HomeWork_18\\files\\Mathrandom.txt");
				
			try {				
				FileOutputStream fos  = new FileOutputStream(outputFile , true);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				PrintStream ps = new PrintStream(bos);
				
				ps.println( (int)(Math.random()*100)+1 );
				
				ps.close();
				bos.close();
				fos.close();				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}

}
