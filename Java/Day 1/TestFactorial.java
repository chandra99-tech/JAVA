import java.util.Scanner;
class TestFactorial{
	public static void main(String [] args){
		System.out.println("Enter the number you wanted the factorial off - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = TestFactorial.factorial(n);
		System.out.println("The Factorial of "+n+" is : "+ ans);
}

	public static int factorial(int n){
		int fact=1;
		for(int i=1; i<=n; i++){
			fact=fact*i;
		}
		return fact;
}

}