package com.cyient.student;

public class StudentDetails {

	public static void main(String[] args) {
		
		Student stu= new Student();
		stu.studentName= "Bhavana";
		stu.studentRollNo= 30;
		stu.studentAddres= "Vijayawada,AP";
		Student.schoolName= "Cyient";
		Student.schoolAddres= "Manikonda,Hyderabad";
		Student.schoolNum= "0406748910";
		
		System.out.println("Student Details\n");
		Student.printStudentDetails(stu);

	}

}
