package Practise;

public class StackOperation {
	public static void main(String[] args) {
		MyStack<Integer> m = new MyStack<Integer>();

		m.push(10);
		m.push(34);
		m.push(32);
		m.push(1);

		m.printStack();

		MyStack<Employee> e = new MyStack<Employee>();
		Employee e1 = new Employee(1, "AAA", 10);
		Employee e3 = new Employee(2, "BBB", 15);
		Employee e2 = new Employee(3, "CCC", 102);
		Employee e4 = new Employee(4, "DDD", 12);
		e.push(e1);
		e.push(e2);
		e.push(e3);
		e.push(e4);

		e.printStack();
	}

}
