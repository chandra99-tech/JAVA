import java.util.Scanner;
class Test2DArray{
	public static void main(String [] args){
		System.out.println("2D Array : ");
		Scanner scan  = new Scanner(System.in);
		System.out.print("Enter the rows of array : ");
		int rows = scan.nextInt();
		System.out.print("Enter the columns of array : ");
		int columns = scan.nextInt();

		int[][] arr = new int[rows][columns];

		getData(arr, rows, columns);
		displayData(arr);

			boolean valid ;
			do{
			valid = true;
			System.out.println("Enter the Choice you wanted to execute : ");
			getChoices();
			int num1 = scan.nextInt();
			switch(num1){
			case 1:
				TestDisplay.primeNum(arr);
				System.out.println("---------------------------------------");
				valid = true;
				break;
			case 2:
				TestDisplay.addNumber(arr);
				System.out.println("---------------------------------------");
				valid = true;
				break;
			case 3:
				TestDisplay.oddNumber(arr);
				System.out.println("---------------------------------------");
				valid = true;
				break;
			case 4:
				TestDisplay.addOddNumber(arr);
				System.out.println("---------------------------------------");
				valid = true;
				break;
			case 5:
				TestDisplay.factorialNum(arr);
				System.out.println("---------------------------------------");
				valid = true;
				break;
			default:
				System.out.println("Wrong Choice!, Please Enter Correct Choice Again ");
				valid = false;
				break;
			}

			}while(!valid);
		
		
			//TestDisplay.nPrime(arr);
		
		
		
		
		
		
		
	}

	public static void getData(int [][] arr, int rows, int columns){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements in Array : ");
		for (int i = 0 ; i<rows; i++){
			for(int j=0; j<columns ; j++){
				arr[i][j]=scan.nextInt();
			}
		}
	}

	public static void displayData(int [][] arr){
		System.out.println("The Elements in the Array are : ");
		for(int i=0 ; i<arr.length; i++){
			for(int j=0 ; j<arr[i].length; j++){
			System.out.print(arr[i][j] + "\t");
			}
		System.out.println();
		}
	}

	public static void getChoices(){
		System.out.println("Do You Want To Display Prime Numbers in Array Matrix Press 1 : ");
		System.out.println("Do you Want To Display Addition of All Numbers in Array Matrix Press 2 : ");
		System.out.println("Do you Want To Display Odd Numbers in Array Matrix Press 3 : ");
		System.out.println("Do you Want To Display Addition of Odd Numbers in Array Matrix Press 4 : ");
		System.out.println("Wanted To Display Factorial of Numbers less than 7 in Array Matrix Press 5 : ");

	}
}