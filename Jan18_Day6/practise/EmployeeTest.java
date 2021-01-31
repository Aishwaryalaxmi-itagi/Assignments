package Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "AAA", 10000);
		Employee e3 = new Employee(2, "BBB", 15000);
		Employee e2 = new Employee(3, "CCC", 10299);
		Employee e4 = new Employee(4, "DDD", 1222);
		Employee e5 = new Employee(1, "AAA", 5000);

		// List l = new ArrayList();
		Set l = new HashSet();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);

		System.out.println(l);

		// EmployeeRepository er=new EmployeeRepository();
		Employee ee1 = new Employee(1, "AAA", 10);
		Employee ee2 = new Employee(2, "BBB", 15);
		Employee ee3 = new Employee(3, "CCC", 102);
		Employee ee4 = new Employee(4, "DDD", 12);

		List<Employee> list = new ArrayList<Employee>();

		list.add(ee3);
		list.add(ee4);
		list.add(ee1);
		list.add(ee2);

		EmpNameComparator en = new EmpNameComparator();
		EmpSalaryComparator sa = new EmpSalaryComparator();
		Collections.sort(list, sa);

		System.out.println(list);

	}

}
