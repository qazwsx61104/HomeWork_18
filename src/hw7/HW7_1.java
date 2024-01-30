package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class HW7_1 {
	
	public static void main(String[] args) throws IOException {
			File Sample = new File ("C:\\THA105_Workspace\\HomeWork_18\\files\\Sample.txt");
			
			System.out.println("Sample.txt檔案共有"+Sample.length()+"個位元組");
			
			FileReader fr = new FileReader(Sample);
			BufferedReader br = new BufferedReader(fr);
			
//			String line;
//			int linecount = 0;
//			
//			while( (line=br.readLine()) != null) {
//				linecount++;
//			}
			int charcount = 0;		

			char  singleChar;
			int linecount = 0;
			int c;
			while( (c=fr.read()) != -1) {
				singleChar = (char) c;
				charcount++ ;
				if(singleChar=='\n')
				{linecount++;}
				
				
			}
			
			
			System.out.println("Sample.txt檔案共有"+ linecount + "行");
			
//			int count ;
//			int charcount = 0;		
//						
//			while( (count = br.read()) != -1) {
//				charcount++;
//			}
			System.out.println("Sample.txt檔案共有"+charcount+"個字元");
			
		
			
//			String line;
//			int linecount = 0;
//			
//			while( (line=br.readLine()) != null) {
//				linecount++;
//			}
//			
//			System.out.println("Sample.txt檔案共有"+ linecount + "行");
			
			br.close();
			fr.close();	
		
	}
}
