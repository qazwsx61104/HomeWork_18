package hw3;

import java.util.Scanner;

public class HW3 {
	
					public static void main(String[] args ) {
						
		//• 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
		//三角形、其它三角形或不是三角形，如圖示結果
				
					
		//• 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
		//對則顯示正確訊息，如圖示結果：
					
					int r = (int) (Math.random() *10) ;
					Scanner sc = new Scanner(System.in);
					System.out.println("開始猜數字吧 0~9 !! "  );
					int  i =sc.nextInt();
					while(i != r)
					{
					if(r == i) 
							{								
								System.out.println("答對了 ! 答案就是 " + i);
							}
					else 
							{
								System.out.println("猜錯囉 ! 答案是 "+ r ) ;	
								break ;
						}
					}
					
						
	//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
	//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
	//的號碼與總數，如圖				
					
										
						
					
				}
}
