package bean;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
	private int eId;
	private String eName;
	private double eSal;
	private LocalDate jdt;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int eId) {
		super();
		this.eId = eId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eId == other.eId;
	}

	public Employee(int eId, String eName, double eSal, LocalDate jdt) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
		this.jdt = jdt;
	}
	

	public Employee(double nm) {
		super();
		this.eSal = nm;
	}

	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSal() {
		return eSal;
	}
	public void seteSal(double eSal) {
		this.eSal = eSal;
	}
	public LocalDate getJdt() {
		return jdt;
	}
	public void setJdt(LocalDate jdt) {
		this.jdt = jdt;
	}
	@Override
	public String toString() {
		return "Employee [Employee_ID =" + eId + ", Employee_Name =" + eName + ", Employee_Salary =" + eSal + ", Data_Of_Joining =" + jdt + "]";
	}
	
	@Override
	public int compareTo(Employee o) {
//		System.out.println("in compareTo method "+this.eId+"-----"+o.eId);
		//return o.empid-this.empid; //descending order
		return this.eId-o.eId;  //asc ending order
	}
	
	

}
