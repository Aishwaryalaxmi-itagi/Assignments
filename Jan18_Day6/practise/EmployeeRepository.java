package Practise;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	List<Employee> t = new ArrayList<Employee>();

	public void addEmp(Employee e) {
		t.add(e);
	}
	
	public void updateEmp(Employee e, Employee e1) {
		t.set(t.indexOf(e)	, e1);
		
	}
	
	public void deleteEmp(Employee e) {
		t.remove(e);
	}
	
	public void getAll() {
		System.out.println(t);
	}
	
	public void getEmp(Employee t) {
		System.out.println(t);
	}
	 

}
