 package com.bscideas.calculator;
import java.util.Scanner;

public class Main {

	private static Scanner sec;

	public static void main(String[] args) {
		
		Calculator perem = new Calculator();
		int number = 0;
		int number1 = 0;
		int choice = 0;
		
		sec = new Scanner(System.in);
		  
	    System.out.println("Введите число A:");
	    
	    try {
	    	number = sec.nextInt();
	    } catch (Exception e) {
	    	System.out.println("Введено не число");
	    	System.exit(1);
	    }    
   
	    System.out.println("Введите число B:");
	       
	    try {
	    	number1 = sec.nextInt();
	    } catch (Exception e) {
	    	System.out.println("Введено не число");
	    	System.exit(1);
	    }
	    //int number1 = sec.nextInt();
	      
	    System.out.println("Если вам нужно умножение, введите - 1, деление - 2, сложение - 3, вычитание - 4");
	       

	    try {
	    	choice = sec.nextInt();
	    	if(choice == 1) {
		    	   perem.multiplication(number, number1);
		       } else if (choice == 2) {
		    	   perem.division(number, number1);
		       } else if (choice == 3) {
		    	   perem.addition(number, number1);
		       } else if (choice == 4) {
		    	   perem.subtraction(number, number1);
		       }
	    } catch (Exception e) {
	    	System.out.println("Вы выбрали некорректное значение");
	    	System.exit(1);
	    }

	    System.out.println("Ваш результат: " + perem.sum);
	  
	}

}

