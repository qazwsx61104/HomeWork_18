package hw5;

public class HW5_2 {
//請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
	public static void main(String[] args) {
		
			 int[] arr = new int[10];
			 randAvg(arr);
		
		}
	
	
				public static void randAvg(int[]arr) {

		   		double sum=0 ;
		   		for(int i = 0 ; i < arr.length ; i++) {
				arr[i] = (int)(Math.random()*101);
				System.out.print(arr[i] + "\t");
				sum += arr[i];
				}
		    	System.out.println();
				System.out.println(sum/arr.length);
				
	}
}
