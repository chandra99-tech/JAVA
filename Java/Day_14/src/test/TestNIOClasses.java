package test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestNIOClasses {

	public static void main(String[] args) {
		Path p = Paths.get("empcsv.csv");
		try {
			if (!Files.exists(p)) {
                System.out.println("File not found: " + p.toAbsolutePath());
                return;
            }
				
			List<String> lst1 = Files.readAllLines(p);
			for(String s : lst1) {
				String [] str = s.split(",");
				System.out.println(str[0]+"----"+str[1]+"----"+str[2]);
			}
			
			System.out.println("Display Employee With The Salary Greater Than 40,000");
			for(String s : lst1) {
				String [] str = s.split(",");
				if(Double.parseDouble(str[2])>40000) {
				System.out.println(str[0]+"----"+str[1]+"----"+str[2]);
				}
			}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println("Error in Reading...");
		}

	}

}
