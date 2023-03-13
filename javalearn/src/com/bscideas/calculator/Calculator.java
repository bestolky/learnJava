package com.bscideas.calculator;

public class Calculator {
	int number;
	int number1;
	int sum;
		
	public Calculator() {
		
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	
	public int addition(int number, int number1) {
		sum = number + number1;
		return sum;
	}
	
	public int multiplication(int number, int number1) {
		sum = number * number1;
		return sum;
	}
	
	public int division(int number, int number1) {
		sum = number / number1;
		return sum;
	}
	
	public int subtraction(int number, int number1) {
		sum = number - number1;
		return sum;
	}

	
	@Override
	public String toString() {
		return "Calculator [Сумма чисел= " + sum + "]";
	}
	
}
