package hw1;

public class HW2 {
	public static void main(String[] args) {
		// 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)

//		int sum1=0; 
//		int i=2;
//		while(i<=1000) {
//			if(i%2==0)
//				sum1 += i ;
//			  	i++;
////		}
////		System.out.println(sum1);
//		
//		int sum1= 0;
//		for(int i=2 ; i<=1000 ; i++) {
//			if( i % 2 ==0 ) {
//				sum1+=i ;
//			}
//		}
//		System.out.println(sum1);

		// 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈
//		int sum2=1 ;
//		for(int j=1 ; j<=10 ; j++) {
//			sum2 *= j ;
//			}
//		System.out.println(sum2);
		int sum2 = 1;
		int j = 1;
		while (j <= 10) {
			sum2 *= j;
			j++;
		}
		System.out.println(sum2);
//		
		// 請設計一隻Java程式，輸出結果為以下： 1 4 9 16 25 36 49 64 81 100

//		int l = 1;
//		for(int k=1;k<=10;k++) {
//			l=k*k;
//			System.out.print(l +" ");
//					
//		}
		int l = 1, k = 1;
		while (k <= 10) {
			l = k * k;
			k++;
			System.out.print(l + " ");
		}
		System.out.println();
		// • 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
		// 輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
//        for(int q = 1 ; q<=49; q++) {
//        	if (q%10==4) {
//        		
//        	}else if (q/10==4) {
//        		
//        	}else {
//        		System.out.print(q+" ");
//        	}
//        }
		for (int q = 1; q <= 49; q++) {
			if (q % 10 != 4 && q / 10 != 4)
				System.out.print(q + " ");
		}
		System.out.println();
		// 請設計一隻JAVA程式，輸出結果如下：
		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5 6 7 8 9
		// 1 2 3 4 5 6 7 8
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1

		for (int w = 10; w >= 1; w--) {
			for (int r = 1; r <= w; r++) {
				System.out.print(r);
			}
			System.out.println();
		}
	}
}
