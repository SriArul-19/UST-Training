package com.oops.encapsulation;

public class Employee {
private int empid;

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

@Override
public String toString() {
	return "Employee [empid=" + empid + "]";
}

}
