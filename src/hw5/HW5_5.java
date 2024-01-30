package hw5;

public class HW5_5 {
	
	public static void main(String[] args) {
		
		HW5_5 authCode = new HW5_5();
		
		authCode.getAuthCode();
		
		
		
	}
		
	public static void getAuthCode() {
	int[] arr = new int[8];
	for (int i = 0; i < arr.length; ) {
		int r = (int) (Math.random() * 123);
		if ((r >= 48 && r <= 57) || (r >= 65 && r <= 90) || (r >= 97 && r <= 122)) {
			arr[i] = r;
			System.out.print((char) arr[i]);
			i++;
			}
		}
	}




}
