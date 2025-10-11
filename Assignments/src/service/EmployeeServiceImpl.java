package service;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import bean.Employee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class EmployeeServiceImpl implements EmpolyeeService {
	private EmployeeDao eDao;

	public EmployeeServiceImpl() {
		eDao = new EmployeeDaoImpl();
		// TODO Auto-generated constructor stub
	}
	
	@Override	
	public boolean addEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Employee ID");
		int eId=sc.nextInt();
		System.out.println("Enter Employee Name");
		String eName=sc.next();
		System.out.println("Enter Employee Salary");
		double eSal=sc.nextDouble();
		System.out.println("Enter Employee Joining Date (dd/mm/yyyy)");
		String dt=sc.next();
		LocalDate ldt= LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e= new Employee(eId,eName,eSal,ldt);
		return eDao.save(e);
	}

	@Override
	public List<Employee> Display() {
		return eDao.showAll();
	}

	@Override
	public Employee SearchById(int id) {
		return eDao.findById(id);
	}

	@Override
	public List<Employee> searchByName(String nm) {
		return eDao.findByName(nm);
	}

	@Override
	public List<Employee> searchBySalary(double sal) {
		return eDao.findBySalary(sal);
	}

	@Override
	public boolean deleteById(int id) {
		return eDao.removeById(id);
	}

	@Override
	public boolean deleteBySalary(double nm) {
		return eDao.removeBySal(nm);
	}

	@Override
	public boolean updateBySalary(int id, double sal) {
		return eDao.modifyBySal(id,sal);
	}

	@Override
	public Set<Employee> sortById() {
		return eDao.arrangeById();
	}

}
