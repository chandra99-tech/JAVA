package test;

import java.util.Scanner;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {

	public static void main(String[] args) {
		
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("myData.txt"));
			DataInputStream dis = new DataInputStream(new FileInputStream("myData.txt"));){
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Salary Of Employee!");
			dos.writeDouble(sc.nextDouble());
			System.out.println("Enter Id Of Employee!");
			dos.writeInt(sc.nextInt());
			System.out.println("Enter Employee Name!");
			dos.writeUTF(sc.next());
			System.out.println("Reading Data ...");
			double num1 = dis.readDouble();
			int num = dis.readInt();
			String nm = dis.readUTF();
			System.out.println(num+"---"+nm+"---"+num1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {	
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
