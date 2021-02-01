package com.thinkitive.multithreading;

public class Demo {
	public static void main(String[] args) {

		// USING THREAD CLASS
		MyClass m1 = new MyClass();
		MyClass m2 = new MyClass();

		myClass2 n1 = new myClass2();

		m1.start();
		m2.start();
		n1.start();

		// USING RUNNABLE INTERFACE
		MyThread mt = new MyThread();
		MyThread mt2 = new MyThread();

		Thread t = new Thread(mt);
		Thread t2 = new Thread(mt2);
		t.start();
		t2.start();
	}

}
