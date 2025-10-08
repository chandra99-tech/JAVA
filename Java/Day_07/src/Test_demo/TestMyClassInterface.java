package Test_demo;

import Interface.I1;
import Interface.I2;
import Interface.MyClass;

public class TestMyClassInterface {

	public static void main(String[] args) 
	{
		MyClass ob=new MyClass();
		ob.m2(10);
		I1 ob2=new MyClass();
		ob2.m1();
		((MyClass) ob2).m3();
		I2 ob3=new MyClass();
		((MyClass)ob3).m1();
		    
	}

}
