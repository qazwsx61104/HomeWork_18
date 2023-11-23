package hw4;

public class HW4 {
		public static void main(String[] args ) {
			
			//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
			int[]x = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
				int sum=0 ;
					for(int i =0 ; i < x.length ; i++)
						{
							sum += x[i];
						}
					//平均值
					int avg = sum / x.length ; 
						System.out.println("平均值 = " + avg) ;
						
					//大於平均值
					for(int i =0 ; i < x.length ; i++)
						{
							if(x[i] > avg)
							{
								System.out.print(x[i] + " ");
							}
						}
			
					System.out.println();
					
			//請建立一個字串,經過程式執行後,輸入結果是反過來的 例如String s = “Hello World”,執行結果即為dlroW olleH
			
						String[] HelloWorld = { "H", "e", "l", "l","o", " ", "W","o", "r","l","d"} ;
							for (int i = HelloWorld.length - 1 ; i >=0 ; i-- ) 
							{
								System.out.print(HelloWorld[i]);
							}
						
					System.out.println();
					
			//• 有個字串陣列如下 (八大行星):			{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
			//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
			
			         String[] star= {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
			         int aeiou = 0 ; 
			         		for(int i = 0 ; i < star.length ; i++)
			         			{
			         				
			         			}
			         		
			
		}
}
