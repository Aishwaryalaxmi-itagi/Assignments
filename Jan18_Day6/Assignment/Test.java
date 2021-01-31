package CaseStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		Address a1 = new Address("belgaum", 590001);
		Address a2 = new Address("hubli", 590004);
		Employee e1 = new Employee(1, "AAA", 10, a1);
		Employee e3 = new Employee(2, "BBB", 15, a2);
		Employee e2 = new Employee(3, "CCC", 10, a2);
		
		List<Employee> list=new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		//Collections.sort(list);
		System.out.println(list);
	}

}
