package hw4;

public class HW4_2 {
	//請建立一個字串，經過程式執行後，輸入結果是反過來的
	//例如String s = “Hello World”，執行結果即為dlroW olleH
		public static void main(String[] args) {
			String[] HelloWorld = { "H", "e", "l", "l","o", " ", "W","o", "r","l","d"} ;
			for (int i = HelloWorld.length - 1 ; i >=0 ; i-- ) 
			{
				System.out.print(HelloWorld[i]);
			}
		
			System.out.println();
		}
}
