package com.jdbc.connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EnrollmentDAO {
    public void enrollStudent(int studentId, int courseId) {
        String query = "INSERT INTO enrollments (student_id, course_id) VALUES (?, ?)";

        try (Connection connection = DatabaseConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, studentId);
            statement.setInt(2, courseId);
            statement.executeUpdate();
            System.out.println("Student enrolled successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void getEnrollments() {
        String query = "SELECT e.id, s.name AS student_name, c.name AS course_name " +
                       "FROM enrollments e " +
                       "JOIN students s ON e.student_id = s.id " +
                       "JOIN courses c ON e.course_id = c.id";

        try (Connection connection = DatabaseConnector.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                System.out.println("Enrollment ID: " + resultSet.getInt("id"));
                System.out.println("Student Name: " + resultSet.getString("student_name"));
                System.out.println("Course Name: " + resultSet.getString("course_name"));
                System.out.println("---------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
