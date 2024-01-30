package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
		
		public static void main(String[] args) {
			int x , y ;
			Scanner number = new Scanner(System.in);
			System.out.println("請輸入 x值");			
			
				if ( number.hasNextInt() ) {
				 x = number.nextInt();
				}					
				else {
							throw new InputMismatchException(" 輸入格式不正確");  
				        }	
				
			System.out.println("請輸入 y值");
			 		y = number.nextInt();
								
						try {
							 Calculator c1 = new Calculator();
							 c1.setXvalue(x);
							 c1.setYvalue(y);
							 c1.getValueResult();
							} catch (CalException ce) {
								ce.printStackTrace();
							}
		}
}
