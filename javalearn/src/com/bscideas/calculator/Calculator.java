package com.bscideas.calculator;

public class Calculator {
	int number;
	int number1;
	int sum;
		
	public Calculator() {
		
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
