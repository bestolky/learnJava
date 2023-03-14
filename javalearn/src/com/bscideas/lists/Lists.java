package com.bscideas.lists;

import java.util.Arrays;
import java.util.Scanner;


public class Lists {
	
	/*
		!Done! - Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
		Ввести n строк с консоли. Вывести на консоль те строки, длина которых больше средней, а также длину.
		Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше средней, а также длину.
		Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.
		Ввести n слов с консоли. Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.
		Ввести n слов с консоли. Найти слово, состоящее только из цифр. Если таких слов больше одного, найти второе из них.
	 */
	String perem;
	String[] letters = new String[3];
	int checkValue;
	int minimumValue;
	int maximumValue;
	
	public String[] inputLetters() { 
		
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		//генерация массива
		for(i = 0; i < letters.length; i++) {
			System.out.println("Input " + (i + 1) + " Letter: ");
			letters[i] = sc.nextLine();
		}
		
		perem = Arrays.toString(letters);
		//System.out.println("Массив данных: " + perem);
		return letters;
		
	}

	public String[] searchShortAndMaxElement() {
		
		int tempCheckValue = letters[0].length();
		int checkValueMin= letters[0].length();
		
		// поиск наибольшего
		for(int i = 0; i < letters.length; i++) {
			checkValue = letters[i].length();
			
			if(checkValue > tempCheckValue) {
				maximumValue = i;
				tempCheckValue = checkValue;
			}
			
			if(checkValue < checkValueMin) {
				minimumValue = i;
				checkValueMin = checkValue;
			}
			//System.out.println("Check: " + checkValue);
		}
		// поиск наименьшего
	
		
		System.out.println("Letter Max: " + letters[maximumValue] + "; amount symbols: " + tempCheckValue );
		System.out.println("Letter Min: " + letters[minimumValue] + "; amount symbols: " + checkValueMin );
		return letters;
	}

}
