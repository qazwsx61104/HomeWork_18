package hw4;

public class HW4_1 {
	public static void main(String[] args) {
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
			
			 }
	public  static int getAvgArray(int[] x) {
		int sum=0 ;
		for(int i =0 ; i < x.length ; i++)
			{
				sum += x[i];
			}
	
		return sum / x.length;
	}

}
