package hw2;

public class HW2_3 {
		public static void main(String[] args ) {
			//請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
			int sum = 1  , i=1 ;
			while( i <=10) {
				sum *= i ;
				i++ ;
			}
			System.out.println(sum);
		}
}
