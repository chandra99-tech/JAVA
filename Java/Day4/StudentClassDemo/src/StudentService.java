package service;

import bean.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentService {
    private static final Student[] students = new Student[100];
    private static int count = 0;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    static {
        try {
            students[0] = new Student(1, "Rajan", 98, 97, dateFormat.parse("11/11/2000"));
            students[1] = new Student(2, "Atharva", 95, 96, dateFormat.parse("11/11/1997"));
            students[2] = new Student(3, "Ashu", 90, 92, dateFormat.parse("11/11/1997"));
            count = 3;
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static boolean addNewStudent(Scanner scanner) {
        System.out.println("Enter ID:");
        int id;
        try {
            id = Integer.parseInt(scanner.nextLine());
            if (id <= 0) {
                System.out.println("Invalid ID. Must be positive.");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID. Please enter a number.");
            return false;
        }

        System.out.println("Enter name:");
        String name = scanner.nextLine();
        if (name.trim().isEmpty()) {
            System.out.println("Invalid name. Cannot be empty.");
            return false;
        }

        System.out.println("Enter marks1:");
        float m1;
        try {
            m1 = Float.parseFloat(scanner.nextLine());
            if (m1 < 0 || m1 > 100) {
                System.out.println("Invalid marks. Must be between 0 and 100.");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid marks1. Please enter a number.");
            return false;
        }

        System.out.println("Enter marks2:");
        float m2;
        try {
            m2 = Float.parseFloat(scanner.nextLine());
            if (m2 < 0 || m2 > 100) {
                System.out.println("Invalid marks. Must be between 0 and 100.");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid marks2. Please enter a number.");
            return false;
        }

        System.out.println("Enter birth date (dd/MM/yyyy):");
        Date birthDate;
        try {
            birthDate = dateFormat.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Invalid date format. Use dd/MM/yyyy.");
            return false;
        }

        if (count >= students.length) {
            System.out.println("Cannot add student. Storage full.");
            return false;
        }

        students[count++] = new Student(id, name, m1, m2, birthDate);
        return true;
    }

    public static void displayAll() {
        if (count == 0) {
            System.out.println("No students to display.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }

    public static Student searchById(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                return students[i];
            }
        }
        return null;
    }

    public static Student[] searchByName(String name) {
        ArrayList<Student> result = new ArrayList<>();
        if (name != null && !name.trim().isEmpty()) {
            for (int i = 0; i < count; i++) {
                if (students[i].getName().toLowerCase().contains(name.toLowerCase())) {
                    result.add(students[i]);
                }
            }
        }
        return result.toArray(new Student[0]);
    }

    public static boolean updateMarks(int id, float m1, float m2) {
        if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100) {
            return false;
        }
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                students[i].setM1(m1);
                students[i].setM2(m2);
                return true;
            }
        }
        return false;
    }
}
