package com.thinkitive.multithreading;

public class Test {
	public static void main(String[] args) {
		
		 OneThread one1=new OneThread(5);
		
		  TwoThread two1=new TwoThread(10);
		 
		 Thread t1=new Thread(one1);
		 Thread t2=new Thread(two1);
	
		 t1.start(); t2.start();
		
		/*
		 * try { Class c = Class.forName(com.thinkitive); }
		 */
	}

}
