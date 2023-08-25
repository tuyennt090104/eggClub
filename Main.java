package mypack;

import week_5.StudentManagement;

class Main {
  public static void main(String[] args) {
  	StudentManagement studentManagement = new StudentManagement();
  	studentManagement.connect();
  	String nameDatabase = "StudentManagement";
  	studentManagement.createDatabase(nameDatabase);
  	studentManagement.selectDatabase(nameDatabase);
  	String students = "Students";
  	String classes = "Classes";
  	studentManagement.createTable(students);
  	studentManagement.createTable(classes);
  	studentManagement.getStudentInfo(1);
  	studentManagement.getStudentInfo("C");
  	studentManagement.getNumberOfStudent();
  	studentManagement.rankAverageScore();
  	studentManagement.update(1, 9.5f);
  	studentManagement.delete(1);
  	studentManagement.highestScore();
  	studentManagement.dropDatabase(nameDatabase);
  	studentManagement.close();
  }		
}