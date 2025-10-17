package dao;

import java.util.List;

import beans.Employee;

public interface EmployeeDao {

	void readData(String fname);

	boolean save(Employee e);

	boolean removeById(int empid);

	boolean updateById(int empid, double sal);

	List<Employee> findAll();

	Employee findById(int empid);

	void writeData(String fname);

}
