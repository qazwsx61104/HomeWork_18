package hw2;

public class HW2_6 {
		public static void main(String[] args) {
//			• 請設計一隻Java程式，輸出結果為以下：
//			1 2 3 4 5 6 7 8 9 10
//			1 2 3 4 5 6 7 8 9
//			1 2 3 4 5 6 7 8
//			1 2 3 4 5 6 7
//			1 2 3 4 5 6
//			1 2 3 4 5
//			1 2 3 4
//			1 2 3
//			1 2 
			
			for(int i = 10 ; i >=0 ; i--)	{
				for(int j = 1; j <= i ; j++)
					System.out.print(j);
				    System.out.println();
			}
		}
}
