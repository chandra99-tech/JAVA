package service;

import java.util.List;
import java.util.Set;

import bean.Employee;

public interface EmpolyeeService {

	boolean addEmployee();

	List<Employee> Display();

	Employee SearchById(int id);

	List<Employee> searchByName(String nm);

	List<Employee> searchBySalary(double sal);

	boolean deleteById(int id);

	boolean deleteBySalary(double nm);

	boolean updateBySalary(int id, double sal);

	Set<Employee> sortById();
}
