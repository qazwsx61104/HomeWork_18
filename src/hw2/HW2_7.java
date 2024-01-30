package hw2;

public class HW2_7 {
		public static void main(String[] args) {
//			請設計一隻Java程式，輸出結果為以下：
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
			
			char a = '\u0041' ;  //unicode a = 0041 
			
			int i =1 , j=1 ;
			
			for(i = 1 ; i <= 6 ; i++) {
				for(j=1 ; j <= i ; j++)
				{
					System.out.print(a);
				}
				a++;
				System.out.println();
				
			}
			
		}
}
