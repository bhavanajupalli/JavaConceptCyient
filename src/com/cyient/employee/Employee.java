package com.cyient.employee;

public class Employee {

	public int empNo;
	public String empName;
	public double empSalary;
	public static String companyName;
	
	public void print(Employee obj)
	{
		System.out.println(obj.empName);
		System.out.println(obj.empNo);
		System.out.println(obj.empSalary);
		System.out.println(companyName);

	}
}
