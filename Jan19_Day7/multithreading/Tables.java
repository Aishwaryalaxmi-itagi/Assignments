package com.thinkitive.multithreading;

public class Tables {

	public synchronized void mathTables(int num) {
		for (int i = 1; i < 11; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}

	}

}
