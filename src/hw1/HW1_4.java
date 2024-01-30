package hw1;

public class HW1_4 {
		public static void main(String[] args) {
			//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
			
			final double pi = 3.1415; 
			
			int r =5 ;
			
			double circle1 = pi*r*r ;
			double circle2 = pi*2*r ;
			
			System.out.println ( "圓面積 = " + circle1);
			System.out.println ( "圓周長 = " + circle2);
					
			
		}

}
