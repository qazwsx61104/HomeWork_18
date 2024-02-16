package hw9;

public class Hw9_1 implements Runnable{
	int counter = 1;
	private String name ;
	
	public Hw9_1 (String name) {
		this.name = name ;		
	}


	public void run() {
		
		while(counter <= 10) {
			System.out.println(name + "吃第" + counter + "碗飯" );
			counter ++ ;
			
			try {
				int sleeptime = (int)(Math.random() * 2501) + 500;
				Thread.sleep(sleeptime);
			
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}		
	}
	
	public static void main(String[] args) {
		
		Hw9_1 m1 = new Hw9_1("饅頭人");
		Thread t1 = new Thread(m1);
		Hw9_1 m2 = new Hw9_1("詹姆士");
		Thread t2 = new Thread(m2);
		
		t1.start();
		t2.start();
		
	}
	

}
