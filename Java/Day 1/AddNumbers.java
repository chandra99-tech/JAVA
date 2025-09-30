import java.util.Scanner;
class AddNumbers{
	public static void main(String [] args){
		System.out.println("Enter Numbers For Addition :");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("The Addition of 2 Numbers is : "+ (n1+n2));
		sc.close();
	}
}