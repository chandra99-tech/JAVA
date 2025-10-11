package test;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import bean.Employee;
import service.EmployeeServiceImpl;
import service.EmpolyeeService;

public class TestEmployeeManagementService  {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		EmpolyeeService e=new EmployeeServiceImpl();
		int choice=0;
		do {
			System.out.println("---Choose Task From Below Menu Option---\n");
			System.out.println("1. Add New Employee Data. \n2. Display all Employee Data. \n3. Search Employee By Id.");
			System.out.println("4. Search Employee By Name. \n5. Search Employee By Salary. \n6. Delete Employee By Id. \n7. Delete Employee By Salary.");
			System.out.println("8. Update Employee Salary. \n9. Sort All Employee Data. \n10. exit \n\nEnter Your Choice : ");
			choice = sc.nextInt();
			switch(choice) {
				case 1->{
					boolean status=e.addEmployee();
					if(status) {
						System.out.println("New Employee Data Added Successfully");
					}
					else {
						System.out.println("Error : Adding Employee");
					}
					System.out.println("---------------------------------------------------------------------");
					
					
				}
				case 2->{
					List<Employee> elist=e.Display();
					elist.forEach(System.out::println);
					
					System.out.println("---------------------------------------------------------------------");
								
				}
				case 3->{
					System.out.println("Enter Employee ID to be Search");
					int id=sc.nextInt();
					Employee el =e.SearchById(id);
					if(el!=null) {
						System.out.println(el);
					}
					else {
						System.out.println("---Error Finding Employee By Id!---");
					}
					
					System.out.println("---------------------------------------------------------------------");
					
				}
				case 4->{
					System.out.println("Enter The Employee Name to be Search");
					String nm=sc.next();
					List<Employee> el=e.searchByName(nm);
					if(el!=null) {
						el.forEach(System.out::println);
					}
					else {
						System.out.println("---Error Finding Employee By Name!---");
					}
					System.out.println("---------------------------------------------------------------------");
					
				}
				case 5->{
					System.out.println("Enter Employee Salary You want to Search");
					double sal = sc.nextDouble();
					List<Employee> sa=e.searchBySalary(sal);
					if(sa!=null) {
						sa.forEach(System.out::println);
					}
					else {
						System.out.println("---Error Finding Employee By Salary!---");
					}
					System.out.println("---------------------------------------------------------------------");
				}
				case 6->{
					System.out.println("Enter Employee ID You want to Delete");
					int id = sc.nextInt();
					boolean status = e.deleteById(id);
					if(status) {
						System.out.println("Employee Data Deleted Successfully");
					}
					else {
						System.out.println("---Error in Deleting Employee Data!---");
					}
					System.out.println("---------------------------------------------------------------------");
					
				}
				case 7->{
					System.out.println("Enter The Employee Salary to be Delete");
					double nm=sc.nextDouble();
					boolean el=e.deleteBySalary(nm);
					if(el) {
						System.out.println("Employee Data Deleted Successfully!");
					}
					else {
						System.out.println("---Employee Salary Not Found!---");
					}
					System.out.println("---------------------------------------------------------------------");
					
				}
				case 8->{
					System.out.println("Enter ID to Update Salary");
					int id =sc.nextInt();
					System.out.println("Enter New Salary");
					double sal=sc.nextDouble();
					boolean status= e.updateBySalary(id,sal);
					if(status) {
						System.out.println("Employee Salary Update Successfully!");
					}
					else {
						System.out.println("---Error: Updating Salary!---");
					}
					System.out.println("---------------------------------------------------------------------");
					
				}
				case 9->{
					Set<Employee>elist=e.sortById();
					elist.forEach(System.out::println);
					
					System.out.println("---------------------------------------------------------------------");
					
				}
				case 10->{
					sc.close();
					System.out.println("------Thank You For Visiting----------");
					
				}
				default->{
					System.out.println("---Please Enter Valid Input Choice From The Above Given Menu!---");
					System.out.println("---------------------------------------------------------------------");
				}
			}
		}while(choice!=10);
	}

}
