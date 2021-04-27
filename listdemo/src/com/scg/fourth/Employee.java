package com.scg.fourth;

public class Employee{
	private int empid;
	private String empname;
	private String empdepartment;
	private String emplocation;
	private int empsalary;
	
	public Employee(int id,String name,String department,String location,int salary) {
		this.setdata(id,name,department,location,salary);
		
	}
	public void setdata(int id,String name,String department,String location,int salary) {
		/*this.*/empid = id;
		/*this.*/empname = name;
		/*this.*/empdepartment = department;
		/*this.*/emplocation = location;
		/*this.*/empsalary = salary;
	}
	public int getId() {
		return empid;
	}
	public  String getName() {
		return empname;
	}
	public String getDepartment() {
		return empdepartment;
	}
	public String getLocation() {
		return emplocation;
	}
	public int getsalary() {
		return empsalary;
	}
	
	
}
