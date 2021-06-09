package com.cyient.details;

public class PersonalDetails {

	public static String schoolName;
	public static String schoolAddress;
	public String studentName;
	public String studentMail;
	public String studentAddress;
	public int studentNum;
	
	
	public void printStudentDet(PersonalDetails ps)
	{
		System.out.println(ps.studentName);
		System.out.println(ps.studentMail);
		System.out.println(ps.studentAddress);
		System.out.println(schoolAddress);
		System.out.println(schoolName);
		System.out.println(ps.studentNum);
	}
	
//	public static PersonalDeatils getMoreEmployementDetails(PersonalDetails  )
//	{
//		
//	}
}
