package test;

import beans.MyClass;
import thread.MyFactorialThread;
import thread.MyPrimeThread;
import thread.MyPrintTableThread;

public class TestMultithreading {

	public static void main(String[] args) {
		MyClass ob = new MyClass();
		
		MyFactorialThread fth = new MyFactorialThread(5, ob);
		fth.start();
		
		MyPrintTableThread pth = new MyPrintTableThread(8, ob);
		pth.start();
		
		MyPrintTableThread pth2 = new MyPrintTableThread(7, ob);
		pth2.start();
		
		MyPrimeThread pth1 = new MyPrimeThread(5, ob);
		Thread th = new Thread(pth1);
		th.start();
		
		
		try {
			fth.join();
			pth.join();
			pth2.join();
			th.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("---Main Function Running---!");

	}

}
