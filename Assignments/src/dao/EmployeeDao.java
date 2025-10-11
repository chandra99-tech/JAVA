package dao;

import java.util.List;
import java.util.Set;

import bean.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> showAll();

	Employee findById(int id);

	List<Employee> findByName(String nm);

	List<Employee> findBySalary(double sal);

	boolean removeById(int id);

	boolean removeBySal(double nm);

	boolean modifyBySal(int id, double sal);

	Set<Employee> arrangeById();

	

}
