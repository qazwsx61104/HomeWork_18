package hw1;

public class HW1 {
	public static void main(String[] args) {
	
		// 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
		// 金加利息共有多少錢 (用複利計算,公式請自行google)
	    
	    int y=1 , money = 1500000 ; double rate = 0.02 ; 
	    
	    for (y=1 ;  y <=10 ; y++) {
	           money *= (1+rate) ; 		
	    }
	    System.out.println((int)money) ; 
	    System.out.println("==================");
	   	    

		
	}
}
