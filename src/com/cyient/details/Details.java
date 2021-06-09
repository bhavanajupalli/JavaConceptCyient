package com.cyient.details;

public class Details {

	public static void main(String[] args) {
		
		PersonalDetails ps1= new PersonalDetails();
		PersonalDetails ps2= new PersonalDetails();
		PersonalDetails ps3= new PersonalDetails();
		
		ps1.studentName= "jack";
		ps1.studentNum= 1001;
		ps1.studentMail= "jack@gmail.com";
		ps1.studentAddress="#23egp";
		PersonalDetails.schoolName= "Global School";
		PersonalDetails.schoolAddress="456";
		
		ps1.printStudentDet(ps1);
		System.out.println("\n");
		
		ps2.studentName= "Peter";
		ps2.studentNum= 1002;
		ps2.studentMail= "peter@gmail.com";
		ps2.studentAddress="#23VNN";
		PersonalDetails.schoolName= "Global School";
		PersonalDetails.schoolAddress="456";
		
		ps2.printStudentDet(ps2);
		System.out.println("\n");
		
		ps3.studentName= "mark";
		ps3.studentNum= 1003;
		ps3.studentMail= "mark@gmail.com";
		ps3.studentAddress="#23HTT";
		PersonalDetails.schoolName= "Global School";
		PersonalDetails.schoolAddress="456";
		
		ps3.printStudentDet(ps3);
		System.out.println("\n");

	}

}
