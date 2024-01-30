package hw4;

public class HW4_6 {
	public static void main(String[] args) {
		// 請算出每位同學考最高分的次數

		int[][] stuscore = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 80 }, { 77, 95, 70, 89, 60, 75, 89, 90 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		int[][] student = { {1, 2, 3, 4, 5, 6, 7, 8},
										{0, 0, 0, 0, 0, 0, 0, 0,}
									}; // 一共8位學生

		
		for (int row = 0; row < stuscore.length; row++) {
			
			int winner = 0;
			int maxScore = 0; 
			
			for (int col = 0; col < stuscore[row].length; col++) {	
				if (stuscore[row][col] > maxScore) {
					maxScore = stuscore[row][col];
					winner = col; 
				}
			}
//			System.out.println("winner  = " + winner);

			student[1][winner]++;
		}
		
		for (int i = 0; i < student[0].length; i++) {
			System.out.print(student[0][i] +"號" + student[1][i] + "次" + "     ");
		}
	}
}
