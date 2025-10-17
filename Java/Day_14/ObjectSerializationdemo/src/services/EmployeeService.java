package services;

import java.util.List;

import beans.Employee;

public interface EmployeeService {

	void readFile(String fname);

	boolean addNewEmployee();

	boolean deleteById(int empid);

	boolean modifyById(int empid, double sal);

	List<Employee> getAll();

	Employee getById(int empid);

	void writeToFile(String fname);

}
