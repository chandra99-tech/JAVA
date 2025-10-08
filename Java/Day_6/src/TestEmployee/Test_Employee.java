package TestEmployee;

import java.util.Date;
import java.util.Scanner;

import Sub_Test.ContractEmp;
import Sub_Test.Employee;
import Sub_Test.SalariedEmp;

public class Test_Employee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Salaried Empolyee \n2. Contract Employee");
		System.out.println("Select The Empolyees Type : ");
		int choice=sc.nextInt();
		Employee e1=null;
		Employee e2=null;
		switch(choice) {
		case 1:
			e1=new SalariedEmp("Ash",new Date(2003,11,21),"HR","Designer",88888);
	    	e2=new SalariedEmp("Chandu",new Date(1999,01,23),"UX","Designer",99999);
			break;
		case 2:
			e1=new ContractEmp("Chinmay",new Date(2003,04,24),"HR","Designer",80,3000);
	    	e2=new ContractEmp("Amol",new Date(2002,04,29),"UX","Designer",80,4000);
			break;
		case 3:
			System.out.println("thnak you for visiting....");
			break;
		default :
			System.out.println("Please Enter Valid Choice !");	
		}
		
		System.out.println("net Sal= "+e1.calculateSal());
    	System.out.println("net Sal= "+e2.calculateSal());
	}

}
