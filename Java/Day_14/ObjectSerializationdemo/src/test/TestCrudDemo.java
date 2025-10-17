package test;

import java.util.List;
import java.util.Scanner;

import beans.Employee;
import services.EmployeeService;
import services.EmployeeServicesImpl;

public class TestCrudDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService eservice = new EmployeeServicesImpl();
		eservice.readFile("empData5.txt");
		System.out.println("---Welcome To Employee Management Service!---");
		int choice =0;
		
		do {
			System.out.println();
			System.out.println("1. Add New Employee\n2. Delete By Id");
			System.out.println("3. Modify By Id\n4.Display All\n5. Display By Id\n6. Exit\nEnter Your Choice: ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1->{
				boolean status=eservice.addNewEmployee();
				if(status) {
					System.out.println("Employee Details Added Successfully");			
				}else {
					System.out.println("Error Adding Employee Details!");
				}
				System.out.println("-------------------------------------------------------------------------------------------------------");
			}
			case 2->{
				System.out.println("Enter id");
				int empid=sc.nextInt();
				boolean status=eservice.deleteById(empid);
				if(status) {
					System.out.println("Deleted Employee Details Successfully");			
				}else {
					System.out.println("Error Deleting Employee Details!");
				}	
				System.out.println("-------------------------------------------------------------------------------------------------------");
			}
			case 3->{
				System.out.println("Enter id");
				int empid=sc.nextInt();
				System.out.println("Enter New Salary");
				double sal=sc.nextDouble();
				boolean status=eservice.modifyById(empid,sal);
				if(status) {
					System.out.println("Modified successfully");			
				}else {
					System.out.println("---Employee Not Found!---");
				}
				System.out.println("-------------------------------------------------------------------------------------------------------");
			}
			case 4->{
				List<Employee> list=eservice.getAll();
				list.forEach(System.out::println);
				System.out.println("-------------------------------------------------------------------------------------------------------");
			}
			case 5->{
				System.out.println("Enter id");
				int empid=sc.nextInt();
				Employee ob=eservice.getById(empid);
				if(ob!=null) {
					System.out.println(ob);
				}else {
					System.out.println("Not Found");
				}
				System.out.println("-------------------------------------------------------------------------------------------------------");
			}
			case 6->{
				eservice.writeToFile("empData5.txt");
				sc.close();
				System.out.println("---Thank You For Visiting!---");
			}
			default->{
				System.out.println("---Invalide Choice! Please Check And Choose A Valid Option---");
				System.out.println("-------------------------------------------------------------------------------------------------------");
			}
			}
		}while(choice!=6);

	}

}
