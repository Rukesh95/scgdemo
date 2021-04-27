package com.scg.fourth;

import java.util.*;

public class SortId implements Comparator<Employee>{ 

@Override
public int compare(Employee o1, Employee o2) {
	return o1.getId()-o2.getId();
}
}