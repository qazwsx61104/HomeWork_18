package hw4;

import java.util.Scanner;

public class HW4_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入西元年");
		int yy = sc.nextInt();
		System.out.println("請輸入月份");
		int mm = sc.nextInt();
		System.out.println("請輸入天數");
		int dd = sc.nextInt();

		sc.close();

		boolean isLeapYear = year(yy);

		if (isLeapYear == true) {
			
						if (mm == 2 && dd > 29) {
							System.out.println("2月不可以超過29天");
							
						} else if (mm <= 2) {
							
							System.out.println(getTotalday(mm,dd) +  "天");	
							
						} else if (mm >2 ) {
							
							System.out.println((getTotalday(mm,dd)+1) +  "天");	
						}  
						
			else 
				System.out.println(getTotalday(mm,dd) +  "天");					
		}
		
	}

//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
//		formatter = formatter.withLocale(Locale.CHINESE);
//		LocalDate date = LocalDate.parse(yy + mm + dd, formatter);
//		System.out.println(date.isLeapYear());

				public static boolean year(int year) {
					return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
				}
			
				
				
				public static int getTotalday(int mm, int dd) {
					int ttlday = 0;
					int[] monthday = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
					for (int i = 0; i < mm - 1; i++) {
						ttlday += monthday[i];
					}
					return ttlday + dd;
				}
}
