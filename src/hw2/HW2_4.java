package hw2;

public class HW2_4 {
		public static void main(String[] args ) {
			// 請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100
			
			int i = 1 ,  list = 0 ;
			for(i=1; i <= 10 ; i++) {
				list = i*i ;
				System.out.print(list + " ");
			}
			
		}
}
