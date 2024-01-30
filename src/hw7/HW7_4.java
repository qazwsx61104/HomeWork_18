package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class HW7_4 {
	
	//請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
	//意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
	
	public static void main(String[] args) {
		
		File dir = new File("C:\\data");
		if(!dir.exists()) {
			dir.mkdir();
		};
		
		
		
		File file = new File("C:\\data\\Animalsinfo.ser");
		Animal[] Animals  = new Animal[2];
		Animals[0] = new Dog("Bobo");
		Animals[1] = new Cat("Kiki");
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(int i =0 ; i < Animals.length ; i++) 
				oos.writeObject(Animals[i]);
			
				oos.close();
				fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}

}
