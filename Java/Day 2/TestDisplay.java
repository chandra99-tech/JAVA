import java.util.Scanner;
public class TestDisplay{
	//Created a primeNumber function to check Prime numbers in Array
	public static void primeNum(int [][] arr){
		System.out.println("The Prime numbers in array are  :");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				int temp=arr[i][j];
				if(isPrime(temp)){
					System.out.print(temp +"\t");
				}
			}
		}
		System.out.println();
	}	


	public static boolean isPrime(int temp){
		if(temp<2){
			return false;
		}
		for(int i = 2 ; i<temp ; i++){
			if(temp%i == 0){
				return false;
			}
		}
		return true;
	}


	// Addition of all the numbers in Array Matrix
      public static void addNumber(int [][] arr){

	
		int sum=0;
         	for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				sum=sum+arr[i][j];
			}
		}	
		System.out.println("The Sum of all the elements of an array is :"+ sum);
	}
 	
	// This function check the Odd number in an array
	public static void oddNumber(int [][] arr){
		System.out.println("The Odd numbers in Array matrix are  :");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
			      if(arr[i][j]%2 !=0){
					System.out.print(arr[i][j]+"\t");
				}
			}
		}
		System.out.println();			
	}

	//This Function does adition of all odd numbers 
	public static void addOddNumber(int [][] arr){
		System.out.println("The Addition of Odd numbers in Array matrix are  :");
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
			      if(arr[i][j]%2 !=0){
					sum = sum+arr[i][j];
				}
			}
		}
		System.out.println(sum);			
	}

	//Factorial of all numbers who's number is less than 7
	public static void factorialNum(int [][] arr){
		System.out.println("The Factorial of Numbers who's number is less than 7 is : ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
			int temp = arr[i][j];
				if(arr[i][j]<7)
				{
					int fact = 1;
					for (int k = 1 ; k<=temp ; k++){
						fact=fact*k;
					}
				System.out.println(arr[i][j] + " Factorial of : "+ fact);
				}
			}
		}			
	}

/* public static void nPrime(int [][] arr){
	Scanner scan = new Scanner(System.in);
        System.out.println("Enter the n Max prime Number");
        int n=scan.nextInt(); 
	int [] prime = new int [];
		for (int i = 0; i<arr.lenth;i++){
			prime[i] = primeNum(arr);
		}    
}*/	


}