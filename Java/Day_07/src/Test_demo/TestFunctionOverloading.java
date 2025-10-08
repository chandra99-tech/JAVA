package Test_demo;
import Sub_Test.MyTestClass;

public class TestFunctionOverloading {
	public static void main(String[] args) {
		MyTestClass obj=new MyTestClass();
		
		System.out.println(obj.Max(25, 20));
		System.out.println(obj.Max(15.5f, 10.3f));
		System.out.println(obj.Max("Ayush", "Chand"));
		System.out.println(obj.Max(5, 15, 13));
		
		System.out.println(obj.add(5, 1,2,3,4,5));
	}
}
