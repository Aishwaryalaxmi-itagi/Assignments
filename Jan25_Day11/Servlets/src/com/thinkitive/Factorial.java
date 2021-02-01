package com.thinkitive;

public class Factorial {
	int res;
	public Factorial() {
		res=1;
	}
	
	public int fact(int num) {
	for(int i=num; i>=1;i--)
	{
		res=res*i;
	}
	return res;
	}

}
