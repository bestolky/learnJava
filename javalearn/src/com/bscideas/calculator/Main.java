package com.bscideas.calculator;
import java.util.Scanner;

public class Main {

	private static Scanner sec;

	public static void main(String[] args) {
		
		sec = new Scanner(System.in);
		  
	    System.out.println("Введите число A:");
	       
	    int number = sec.nextInt();
	       
	    System.out.println("Введите число B:");
	       
	    int number1 = sec.nextInt();
	       
	    System.out.println("Если вам нужно умножение, введите - 1, деление - 2, сложение - 3, вычитание - 4");
	       
	    int choice = sec.nextInt();
	    
	    Calculator perem = new Calculator();
	    
	    if(choice == 1) {
	    	   perem.multiplication(number, number1);
	       } else if (choice == 2) {
	    	   perem.division(number, number1);
	       } else if (choice == 3) {
	    	   perem.addition(number, number1);
	       } else if (choice == 4) {
	    	   perem.subtraction(number, number1);
	       } else {
	       System.out.println("Вы выбрали некорректное значение");
	       }
	       
	    System.out.println("Ваш результат: " + perem.sum);
	  
	}

}

