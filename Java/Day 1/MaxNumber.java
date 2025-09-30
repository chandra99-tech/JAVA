import java.util.Scanner;

class MaxNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter First Number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int n2 = sc.nextInt();
		System.out.println("Enter Third Number : ");	
		int n3 = sc.nextInt();
		System.out.println("Comparing Three Numbers : "+n1+" "+n2+" "+n3);
		if(n1>n2 && n1>n3){
			System.out.println(n1+" is Greatest Among All Numbers");
		}
		else if(n2>n3){
			System.out.println(n2+" is Greatest Among All Numbers");
		}
		else{
			System.out.println(n3+" is Greatest Among All Numbers");
		}
				

	}
}