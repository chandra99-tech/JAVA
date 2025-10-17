package test;

import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import beans.Employee;

public class TestSerialization {

	public static void main(String[] args) {
		List<Employee> lst=new ArrayList<>();
		lst.add(new Employee(101,"Ayush","Developer",56789));
		lst.add(new Employee(102,"Omkar","Manager",55444));
		lst.add(new Employee(103,"Amit","Male Nurse",6665));
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empData1.txt"));){
			for(Employee e : lst) {
				oos.writeObject(e);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empData1.txt"));){
			while(true) {
				Employee e = (Employee)ois.readObject();
				System.out.println(e);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
