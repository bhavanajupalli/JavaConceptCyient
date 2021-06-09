package com.cyient.student;

public class Student {
	
	public static String schoolName;
	public static String schoolAddres;
	public static String    schoolNum;
	public String studentName;
	public String studentAddres;
	public int studentRollNo;
	
	public static void printStudentDetails(Student stu)
	{
		System.out.println(stu.studentName);
		System.out.println(stu.studentRollNo);
		System.out.println(stu.studentAddres);
		System.out.println(schoolName);
		System.out.println(schoolAddres);
		System.out.println(schoolNum);
	}

}
