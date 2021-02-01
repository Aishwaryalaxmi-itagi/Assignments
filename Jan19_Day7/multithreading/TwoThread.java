package com.thinkitive.multithreading;

public class TwoThread implements Runnable {
	int num;
	Tables t=new Tables();

	public TwoThread(int num) {
		super();
		this.num = num;
	}

	@Override
	public void run() {
		t.mathTables(this.num);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}

}
