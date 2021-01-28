package com.thinkitive;

public class demo {
	public static void main(String[] args) {
		MyDbConnection d=new MyDbConnection();
		
		d.insertEmployee(16, "CBZ", 45000);
		d.displayEmployee();
		
		d.deleteEmployee(16, "CBZ", 45000);
		d.displayEmployee();
		
		d.updateEmployee(12, "CBZ", 75000);
		d.displayEmployee();
	}

}
