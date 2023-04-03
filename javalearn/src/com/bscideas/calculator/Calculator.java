package com.bscideas.calculator;

import java.util.Scanner;

public class Calculator {

	int sum;
	private static Scanner sec;
	
	public void inputValue() {
		
		int number = 0;
		
		int number1 = 0;
		
		int choice = 0;

		sec = new Scanner(System.in);
		
		try {
			System.out.println("Введите первое число: ");
		      
		    number = sec.nextInt();
		      
		    System.out.println("Введите второе число: ");
		      
		    number1 = sec.nextInt();
		      
		    System.out.println("Если вам необходимо умножение, введите - 1, деление - 2, сложение - 3, вычитание - 4");
		      
		    choice = sec.nextInt();
		    
		    if(choice == 1) {
		    	
		    	multiplication(number, number1);
		    	
		    }else if(choice == 2) {
		    	
		    	division(number, number1);
		    	
		    }else if(choice == 3) {
		    	
		    	addition(number, number1);
		    	
		    }else if(choice == 4) {
		    	
		    	subtraction(number, number1);
		    	
		    }else {
		    	
		    	System.out.println("Такой операции не существует");
		    }
			
		}catch (Exception e) {
			
			System.out.println("Вы ввели не число!");
			
		}
		
		String template = String.format("Ответ: %d ", sum);
		
		System.out.println(template);
		
	}
	
	private int addition(int number, int number1) {
		
		sum = (int)number + (int)number1;
		
		return sum;
	}
	
	private int multiplication(int number, int number1) {
		
		sum = number * number1;

		return sum;
	}
	
	private int division(int number, int number1) {
		
		sum = number / number1;	

		return sum;
	}
	
	private int subtraction(int number, int number1) {
		
		sum = number - number1;

		return sum;
	}

}
