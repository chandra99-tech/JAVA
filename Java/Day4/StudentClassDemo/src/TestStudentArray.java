package test;

import bean.Student;
import service.StudentService;
import java.util.Scanner;

public class TestStudentArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\n1. Add new student\n2. Display all\n3. Search by ID");
            System.out.println("4. Search by name\n5. Update marks\n6. Exit\nChoice:");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    if (StudentService.addNewStudent(scanner)) {
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("Failed to add student.");
                    }
                    break;
                case 2:
                    StudentService.displayAll();
                    break;
                case 3:
                    System.out.println("Enter student ID:");
                    try {
                        int id = Integer.parseInt(scanner.nextLine());
                        Student student = StudentService.searchById(id);
                        System.out.println(student != null ? student : "No student found with ID: " + id);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID. Please enter a number.");
                    }
                    break;
                case 4:
                    System.out.println("Enter student name:");
                    String name = scanner.nextLine();
                    Student[] results = StudentService.searchByName(name);
                    if (results.length > 0) {
                        System.out.println("Students found:");
                        for (Student s : results) {
                            System.out.println(s);
                        }
                    } else {
                        System.out.println("No students found with name: " + name);
                    }
                    break;
                case 5:
                    System.out.println("Enter student ID:");
                    try {
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter new marks1:");
                        float m1 = Float.parseFloat(scanner.nextLine());
                        System.out.println("Enter new marks2:");
                        float m2 = Float.parseFloat(scanner.nextLine());
                        if (StudentService.updateMarks(id, m1, m2)) {
                            System.out.println("Marks updated successfully.");
                        } else {
                            System.out.println("Failed to update marks. Invalid ID or marks.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter valid numbers.");
                    }
                    break;
                case 6:
                    System.out.println("Thank you for visiting!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
