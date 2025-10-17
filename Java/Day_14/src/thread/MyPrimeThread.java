package thread;

import beans.MyClass;

public class MyPrimeThread extends Thread{
	private int n;
	private MyClass ob;
	
	public MyPrimeThread(int n , MyClass ob) {
		super();
		this.n=n;
		this.ob=ob;
	}
	
	@Override
	public void run() {
		boolean status = ob.checkPrime(n);
		if(status) {
			System.out.println("Number Is Prime Number");
		}
		else {
			System.out.println("Number Is Not Prime!");
		}
	}
}
