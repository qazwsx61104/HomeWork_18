package hw4;

public class HW4_3 {
		public static void main(String[] args ) {					
			
					
			int sumAll = 0;
			String[] s3 = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
			//先把陣列字串轉成陣列[索引值]字元放置t
			for (int x1 = 0; x1 < s3.length; x1++) {
				for (int j1 = 0; j1 < s3[x1].length(); j1++) {
					char t = s3[x1].charAt(j1);
					
					switch (t) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						sumAll += 1;
						break;
					}
				}
//				可參考
//				System.out.println(s3[x1]);
			}
			System.out.print("陣列");
			for (int y = 0; y < s3.length; y++)
				System.out.print(" " + s3[y] + " ");
			System.out.println();
			System.out.println("這陣列裡面共有多少個母音(a, e, i, o, u) 共 :" + sumAll + "個");
	//
		}
}