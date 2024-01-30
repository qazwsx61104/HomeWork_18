package hw5;

import java.util.Scanner;

public class HW5_1 {
//請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，
//	即會印出對應的*長方形，如圖：
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		
		 starSquare(x,y);
		
	}
	
	public static void starSquare(int x , int y) {
		int i ,j ;
		for(i = 1; i <= y ; i++) {
			for (j=1; j<=x; j++)
				System.out.print("*");
				System.out.println();
			}
		}
}
