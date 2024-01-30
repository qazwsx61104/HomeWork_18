package hw3;

import java.util.Scanner;

public class HW3_1 {
	//• 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
	//三角形、其它三角形或不是三角形，如圖示結果：
			public static void main(String[] args) {
				System.out.println("請輸入三角形三邊長");
				int [] i = new int[3];
				Scanner sc = new Scanner(System.in);
				if(sc.hasNextInt()) {
					i[0] = sc.nextInt();
					i[1] = sc.nextInt();
					i[2] = sc.nextInt();
				}
				
				if ( i[0] * i[1] * i[2] != 0 ) {
						if( i[0] == i[1] && i[1] == i[2] && i[2] == i[0]) {
								System.out.println("正三角形");
					} 
						else if( i[0] == i[1] || i[1] == i[2] || i[2] == i[0])  {
								System.out.println("等腰三角形");
					}
						else if ( Math.pow(i[0],2) == (Math.pow(i[1],2)+Math.pow(i[1],2))
								||Math.pow(i[1],2) == (Math.pow(i[0],2)+Math.pow(i[2],2))
								||Math.pow(i[2],2) == (Math.pow(i[1],2)+Math.pow(i[0],2))) {
									System.out.println("直角三角形");
					} 	
						
						else if ( i[0] + i[1] > i[2] && i[1] + i[2] > i[0] && i[0]+i[2] > i[1] ){
							    System.out.println("其他三角形");
					} 
					
						else {
						System.out.println("不是三角形");
					}
							
		}					
				else {
					System.out.println("不是三角形");
				}		 
		 }							
	}
