package Interface;

import Interface.I1;
import Interface.I2;

public class MyClass implements I1, I2 {

	@Override
	public void m1() {
		System.out.println("in m1 method");
		
	}

	@Override
	public void m2(int x) {
	    System.out.println("in m2 method "+x);
		
	}
	
	@Override
	public void m3() {
		
	}
}
