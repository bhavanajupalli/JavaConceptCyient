package com.cyient.employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee obj1= new Employee();
		
		Employee.companyName= "Cyient";
		obj1.empNo= 101;
		obj1.empName="john";
		obj1.empSalary=5000;
		obj1.print(obj1);
		
		
		Employee obj2= new Employee();
		obj2.empNo= 102;
		obj2.empName="can";
		obj2.empSalary=2000.0;
		obj2.print(obj2);
		
				
		Employee obj3= new Employee();
		obj3.empNo= 103;
		obj3.empName="Damen";
		obj3.empSalary=4000.0;
		obj3.print(obj3);
	

	}

}
