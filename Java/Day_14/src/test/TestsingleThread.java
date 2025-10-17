package test;

import beans.MyClass;

public class TestsingleThread {

	public static void main(String[] args) {
		MyClass ob = new MyClass();
		int ans = ob.factorial(6);
		System.out.println("Factorial :" + ans);
		ob.printTable(4);
		ob.printTable(2);

	}

}
