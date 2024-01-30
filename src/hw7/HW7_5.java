package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class HW7_5  {
		
	public static void main(String[] args) throws Exception {
				File inputfile = new File("C:\\data\\Animalsinfo.ser");				
				FileInputStream fis = new FileInputStream(inputfile);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				try {
				while(true) {
						 ((Animal) ois.readObject()).speak();						
						}
				}catch (EOFException e) {						
						System.out.println("資料讀取完畢!");
					}
				ois.close();
				fis.close();	
	}
}
