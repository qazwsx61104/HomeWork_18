package hw9;

class Account {
	private int balance = 0;

	synchronized public void save(int amount) {
		while (balance > 3000) {
			System.out.println("媽媽看到餘額大於3000 以上，暫停匯款");
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		balance += amount;
		System.out.println("媽媽存了" + amount + "，帳戶共有" + balance);
		notify();
	}

	synchronized public void withDraw(int amount) {
		while (balance < amount) {
			System.out.println("熊大看到帳戶沒錢了，暫停提款");
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		balance -= amount;
		System.out.println("熊大領了" + amount + "，帳戶共有" + balance);
		if (balance < 2000) {
			System.out.println("媽媽被熊大要求匯款");
			notify();
		}
	}
}

class Saving extends Thread {
	Account account;

	public Saving(Account account) {
		this.account = account;
	}

	public void run() {

		for (int i = 1; i <= 10; i++)
			account.save(2000);

	}

}

class WithDrawal extends Thread{
	Account account;
	
	public  WithDrawal(Account account) {
		this.account = account ;
	}
	
	public void run() {
		
		for(int i =1 ; i<=10 ; i++) 
			account.withDraw(1000);
	}
	
}

public class Hw9_2 {
	
	public static void main(String[] args) {
		 Account account = new Account();
		 Saving saving = new Saving(account);
		 WithDrawal withdrawal = new WithDrawal(account);
		 
		 saving.start();
		 withdrawal.start();
		
	}

}
