package dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.TreeSet;

import bean.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	 static List<Employee> elist;
	 static {
		 elist=new ArrayList<>();		 
		 elist.add(new Employee(105,"Vinayak",55000,LocalDate.of(2021, 11, 12)));
		 elist.add(new Employee(103,"Chinmay",35678,LocalDate.of(2020, 11, 12)));
		 elist.add(new Employee(106,"Amol",45000,LocalDate.of(2020, 10, 12)));
		 elist.add(new Employee(100,"Ash",45678,LocalDate.of(2024, 11, 12)));
		 elist.add(new Employee(101,"Chandu",55678,LocalDate.of(2023, 11, 12)));
	 }	

	@Override
	public boolean save(Employee e) {
		return elist.add(e);
	}

	@Override
	public List<Employee> showAll() {
		return elist;
	}

	@Override
	public Employee findById(int id) {
		for(Employee e:elist) {
			if(e.geteId()==id) {
				return e;
			}
		}
		return null;
	}

	@Override
	public List<Employee> findByName(String nm) {
		List<Employee>temp=elist.stream()
                .filter(emp->emp.geteName().equals(nm))
                .collect(Collectors.toList());
		
		if(temp.size()>0) {
			return temp ;
		}
		return null;
	}

	@Override
	public List<Employee> findBySalary(double sal) {
		List<Employee>temp=elist.stream()
                .filter(emp->emp.geteSal()==(sal))
                .collect(Collectors.toList());
		
		if(temp.size()>0) {
			return temp ;
		}
		return null;
	}

	@Override
	public boolean removeById(int id) {
		return elist.remove(new Employee(id));
	}

	@Override
	public boolean removeBySal(double nm) {
		return elist.removeIf(e->e.geteSal()==nm);
	}

	@Override
	public boolean modifyBySal(int id, double sal) {
		Employee e=findById(id);
		if(e!=null) {
			e.seteSal(sal);
			return true;
		}
		return false ;
	}

	@Override
	public Set<Employee> arrangeById() {
		Set<Employee>tset=new TreeSet<>();
		for(Employee e:elist) {
			tset.add(e);
		}
		return tset;
	}
	
}
