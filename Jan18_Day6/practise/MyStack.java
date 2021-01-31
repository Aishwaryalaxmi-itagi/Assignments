package Practise;

import java.util.ArrayList;
import java.util.List;

public class MyStack<E> {// GENERIC

	List<E> l = new ArrayList<E>();

	public void push(E data) {
		l.add(data);

	}

	public E pop() {
		E data = (E) l.remove(l.size() - 1);
		return data;

	}

	public void printStack() {
		System.out.println(l);
	}
}
