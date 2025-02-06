package feb4assignments;

public class ThreadSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new Account();
		
		Customer customer=new Customer(account); 
		customer.start();
		try {
			customer.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Balance is "+account.getbalance());
	}

}


class Account {
	private int balance=0;
	public synchronized void deposit(int amount) {
		balance+=amount;
	}
	public int getbalance() {
		return balance;
		
	}
}

class Customer extends Thread{
	Account account;
	public Customer (Account account) {
		this.account=account;
	}
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				account.deposit(1000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}