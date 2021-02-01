package com.thinkitive.multithreading;

public class myClass2 extends Thread {

	@Override
	public void run() {

		for (int i = 97; i <123; i++) {
			System.out.println((char) i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
