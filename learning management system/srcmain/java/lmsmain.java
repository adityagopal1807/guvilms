package com.jdbc.connector;

import java.util.Scanner;

public class LMSMain {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        CourseDAO courseDAO = new CourseDAO();
        EnrollmentDAO enrollmentDAO = new EnrollmentDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("LMS Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Add Course");
            System.out.println("4. View Courses");
            System.out.println("5. Enroll Student in Course");
            System.out.println("6. View Enrollments");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter Student Email: ");
                    String studentEmail = scanner.nextLine();
                    studentDAO.addStudent(studentName, studentEmail);
                    break;

                case 2:
                    studentDAO.getStudents();
                    break;

                case 3:
                    System.out.print("Enter Course Name: ");
                    String courseName = scanner.nextLine();
                    courseDAO.addCourse(courseName);
                    break;

                case 4:
                    courseDAO.getCourses();
                    break;

                case 5:
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();
                    System.out.print("Enter Course ID: ");
                    int courseId = scanner.nextInt();
                    enrollmentDAO.enrollStudent(studentId, courseId);
                    break;

                case 6:
                    enrollmentDAO.getEnrollments();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
