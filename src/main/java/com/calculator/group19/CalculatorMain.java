package com.calculator.group19;

public class CalculatorMain {
public CalculatorMain(){
		
	}
	public int add(int a, int b){
		return a+b;
	}
	public int div(int a, int b){
		if(b==0) {
			return 0;
		}
		return a/b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	public int abs(int a) {
		int aa=0;
		if (a>=0) {
			aa=a;
		}
		else {
			aa=-a;
		}
		return aa;
	}
	
	public int power(int a, int b) {
		int result = 0;
		if (b==0&&a!=0) {
			result = 1;
		}
		else if(b<0) {
			result = 0;
		}
		else if(b>0) {
			result = a;
			for (int i = 1;i<b;i++) {
				result = result * a;
			}
		}
		return result;
	}
	public int square(int a )
	{
		return a*a;
	}
}
