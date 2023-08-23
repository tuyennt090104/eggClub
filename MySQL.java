package week_4;
	
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL {
	private Connection connection = null;
	private final String url = "jdbc:mysql://localhost:3306/";
	private final String user = "root";
	private final String password = "123456";
	public void connect() {	
		try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Success connection");			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} 
	}
	public void close() {
		try {
			if(connection != null) {
				connection.close();
			} 
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	public void createDatabase(String nameDatabase) {
		System.out.println("create " + nameDatabase);
		try(Statement statement = connection.createStatement()){
			String sql = "CREATE DATABASE " + nameDatabase;
			statement.executeUpdate(sql);
			System.out.println("Database created successfully...");   
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void selectDatabase(String nameDatabase) {
		System.out.println("select " + nameDatabase);
		try {
			connection = DriverManager.getConnection(url + nameDatabase, user, password);
			System.out.println("Success select");			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} 
	}
	public void createTable(String nameTable) {
		try(Statement statement = connection.createStatement()) {
			String sql = "CREATE TABLE " + nameTable + '(' 
								 + "id INT AUTO_INCREMENT PRIMARY KEY,"
								 + "student_id VARCHAR(8),"
								 + "name VARCHAR(30),"
								 + "age INT,"
								 + "major VARCHAR(30)"
								 + ')';
			statement.executeUpdate(sql);
			System.out.println("Table created successfully...");   
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void insert(String nameTable, String student_id, String name, int age, String major) {
		try(Statement statement = connection.createStatement()) {
			String sql = "INSERT INTO " + nameTable + " (student_id, name, age, major) " 
								 + "VALUES ('" + student_id + "', '" + name + "', " + age + ", '" + major + "')";
			System.out.println(sql);
			statement.executeUpdate(sql);
			System.out.println("insert successfully...");   
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void selectRecords(String nameTable) {
		try(Statement statement = connection.createStatement()){
			String sql = "SELECT * FROM " + nameTable;
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println("select records successfully");
			while(resultSet.next()) {
				System.out.print("id: " + resultSet.getInt("id"));
				System.out.print(", student_id: " + resultSet.getString("student_id"));
				System.out.print(", name: " + resultSet.getString("name"));
				System.out.print(", age: " + resultSet.getInt("age"));
				System.out.println(", major: " + resultSet.getString("major"));
			}
			resultSet.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void updateRecords(String nameTable, int id, String student_id, String name, int age, String major) {
		try(Statement statement = connection.createStatement()) {
			String sql = "UPDATE " + nameTable + ' '
								 + "SET "
								 + "student_id = '" + student_id + "', "
								 + "name = '" + name +  "', "
								 + "age = " + age + ", "
								 + "major = '" + major + "' "
								 + "WHERE id = " + id;
			System.out.println(sql);
			statement.executeUpdate(sql);
			System.out.println("update records successfully");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void deleteRecords(String nameTable, int id) {
		try(Statement statement = connection.createStatement()) {
			String sql = "DELETE FROM " + nameTable + ' '
								 + "WHERE id = " + id;
			System.out.println(sql);
			statement.executeUpdate(sql);
			System.out.println("delete records successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
