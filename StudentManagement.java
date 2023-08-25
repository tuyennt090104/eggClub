package week_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.a.result.ResultsetRowsStatic;

public class StudentManagement<connection> {
	private Connection connection = null;
	private final String url = "jdbc:mysql://localhost/";
	private final String user = "root";
	private final String password = "123456";
	public void connect() {
		try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Success connect");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void close() {
		try {
			if(connection != null) {
				connection.close();
			}
			System.out.println("Success close");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void createDatabase(String nameDatabase) {
		try (Statement statement = connection.createStatement()){
			String sql = "CREATE DATABASE " + nameDatabase;
			statement.executeUpdate(sql);
			System.out.println("Success create database");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void selectDatabase(String nameDatabase) {
		try {
			connection = DriverManager.getConnection(url + nameDatabase, user, password);
			System.out.println("Success select database");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void dropDatabase(String nameDatabase) {
		try (Statement statement = connection.createStatement()){
			String sql = "DROP DATABASE " + nameDatabase;
			statement.executeUpdate(sql);
			System.out.println("Success drop database");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void createTable(String nameTable) {
		try (Statement statement = connection.createStatement()){
			String sql = null;
			if(nameTable == "Students") {
				sql = "CREATE TABLE " + nameTable + " ("
						+ "StudentID INT, "
						+ "StudentName VARCHAR(30), "
						+ "ClassID INT, "
						+ "AverageScore FLOAT )";
			}
			else
			if(nameTable == "Classes") {
				sql = "CREATE TABLE " + nameTable + " ("
						+ "ClassID INT, "
						+ "ClassName VARCHAR(30) )";
			}
			statement.executeUpdate(sql);
			System.out.println("Success create table");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void getStudentInfo(int studentID) {
		try (Statement statement = connection.createStatement()){
			String sql = "SELECT a.StudentID, a.StudentName, b.ClassName, a.AverageScore "
								 + "FROM Students a "
								 + "INNER JOIN Classes b ON a.ClassID = b.ClassID "
								 + "WHERE a.StudentID = " + studentID;
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				System.out.print("StudentID: " + resultSet.getInt(1));
				System.out.print(", StudentName: " + resultSet.getString(2));
				System.out.print(", ClassName: " + resultSet.getString(3));
				System.out.println(", AverageScore: " + resultSet.getFloat(4));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void getStudentInfo(String studentName) {
		try (Statement statement = connection.createStatement()){
			String sql = "SELECT a.StudentID, a.StudentName, b.ClassName, a.AverageScore "
								 + "FROM Students a "
								 + "INNER JOIN Classes b ON a.ClassID = b.ClassID "
								 + "WHERE a.StudentName = '" + studentName + '\'';
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				System.out.print("StudentID: " + resultSet.getInt(1));
				System.out.print(", StudentName: " + resultSet.getString(2));
				System.out.print(", ClassName: " + resultSet.getString(3));
				System.out.println(", AverageScore: " + resultSet.getFloat(4));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void getNumberOfStudent() {
		try (Statement statement = connection.createStatement()){
			String sql = "SELECT c.ClassID, c.ClassName, COUNT(*) AS \"Number\" "
								 + "FROM ("
								 + "SELECT a.ClassID AS ClassID, b.ClassName AS ClassName "
								 + "FROM Students a "
								 + "INNER JOIN Classes b ON a.CLassID = b.ClassID "
								 + ") AS c "
								 + "GROUP BY c.ClassID, c.ClassName "
								 + "ORDER BY COUNT(*) DESC";
			System.out.println(sql);
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				System.out.print("Class ID: " + resultSet.getInt("c.ClassID"));
				System.out.print(" ,ClassName: " + resultSet.getString("c.CLassName"));
				System.out.println(" ,Number: " + resultSet.getInt("Number"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void rankAverageScore() {
		try (Statement statement = connection.createStatement()){
			String sql = "SELECT * "
								 + "FROM Students "
								 + "ORDER BY AverageScore DESC";
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				System.out.print("StudentID: " + resultSet.getInt("StudentID"));
				System.out.println(", AverageScore: " + resultSet.getFloat("AverageScore"));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void update(int id, float x) {
		try (Statement statement = connection.createStatement()){
			String sql = "UPDATE Students "
								 + String.format("SET AverageScore = %f ", x)
								 + String.format("WHERE StudentID = %d", id);
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void delete(int id) {
		try (Statement statement = connection.createStatement()){
			String sql = "DELETE FROM students "
								 + String.format("WHERE StudentID = %d", id);
			statement.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void highestScore() {
		try (Statement statement = connection.createStatement()){
			String sql = "SELECT * "
								 + "FROM Students a "
								 + "WHERE a.AverageScore = ( "
								 		+ "SELECT MAX(b.AverageScore) "
								 		+ "FROM Students b "
								 		+ "WHERE b.ClassID = a.ClassID "
								 + ")";
			ResultSet resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				System.out.print("StudentID: " + resultSet.getInt(1));
				System.out.print(", StudentName: " + resultSet.getString(2));
				System.out.print(", ClassName: " + resultSet.getString(3));
				System.out.println(", AverageScore: " + resultSet.getFloat(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
