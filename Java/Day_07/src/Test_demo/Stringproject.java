package Test_demo;

public class Stringproject {

	public static void main(String[] args) {
		String s1="Test";
		String s2=s1;
		String s3=new String("Test");
		
		System.out.println("s1==s2: "+ (s1==s2));
		System.out.println("s1==s3: "+ (s1==s3));
		System.out.println("s1.equal(s3): "+s1.equals(s3));
		s1="welcome";
		System.out.println("s1==s2: "+ (s1==s2));
		
		StringBuffer sbf=new StringBuffer("Welcome ");
		System.out.println(sbf.append(" to home"));
		
		StringBuilder sbd = new StringBuilder("hello");
		System.out.println(sbd.append(" Ash"));
	}

}
