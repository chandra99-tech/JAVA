package test;

import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import beans.Employee;

public class TestReadCSV {

	public static void main(String[] args) {
		List<Employee> lst = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader("empData.txt"));){
			String line =br.readLine();
			while(line!=null) {
				String [] arr = line.split(",");
				
				Employee emp = new Employee();
				emp.setEid(Integer.parseInt(arr[0]));
				emp.setEname(arr[1]);
				emp.setDesg(arr[2]);
				emp.setSal(Double.parseDouble(arr[3]));
				lst.add(emp);
				line = br.readLine();
			}
			
			lst.forEach(System.out::println);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
