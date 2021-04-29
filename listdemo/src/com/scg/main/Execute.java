package com.scg.main;
import java.util.*;
import com.scg.fourth.Employee;
import com.scg.fourth.SortId;
import com.scg.fourth.SortSal;
public class Execute {

	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<Employee>();
		int employee1=1;
		String x="hello welcome";
		int salary=40000;

		employee.add(new Employee(3, "Rukesh","Developer","Bangalore",25000));
		employee.add(new Employee(4, "Ravichandra","Tester","Bangalore",22000));
		employee.add(new Employee(1, "Nayana","Analyst","Bangalore",20000));
		System.out.println("\nWithout sorting");
		for(Employee emp : employee) {
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getDepartment()+" "+emp.getLocation());
		}
		Collections.sort(employee,new SortId());
		System.out.println("\nSorting based in Employee_Id");
		for(Employee emp : employee) {
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getDepartment()+" "+emp.getLocation()+ " "+emp.getsalary());
		}
		System.out.println("\n");
		System.out.println("\nSorting based in Employee_Salary");
		Collections.sort(employee,new SortSal());
		for(Employee emp : employee) {
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getDepartment()+" "+emp.getLocation()+ " "+emp.getsalary());
		}
	}

}
