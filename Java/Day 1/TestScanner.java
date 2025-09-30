import java.util.Scanner;

class TestScanner{
	public static void main(String [] args){
		System.out.println("Testing Scanner Functions");
		Scanner sc = new Scanner(System.in);
		// Accessing Integer
		System.out.println("Enter Integer : ");
		int n = sc.nextInt();
		// Accessing Float
		System.out.println("Enter Float : ");
		float f = sc.nextFloat();
		// Accessing String without space
		System.out.println("Enter String : ");
		String s = sc.next();
		sc.nextLine();
		// Accessing String with spaces
		System.out.println("Enter String : ");
		String s1 = sc.nextLine();
		System.out.println("Integer : "+n);
		System.out.println("Float : "+f);
		System.out.println("String Without Space : "+s);
		System.out.println("String with spaces : "+s1);
		 
}
}