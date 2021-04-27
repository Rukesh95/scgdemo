package com.scg.fourth;

import java.util.Comparator;

public class SortSal implements Comparator<Employee>{


	public int compare(Employee o1, Employee o2) {
		return o1.getsalary()-o2.getsalary();
	}

}
