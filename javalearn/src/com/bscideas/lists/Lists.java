package com.bscideas.lists;

import java.util.Arrays;
import java.util.Scanner;


public class Lists {
	
	/*
		!DONE! - Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
		!DONE! Ввести n строк с консоли. Вывести на консоль те строки, длина которых больше средней, а также длину.
		!DONE! Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше средней, а также длину.
		Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.
		Ввести n слов с консоли. Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.
		Ввести n слов с консоли. Найти слово, состоящее только из цифр. Если таких слов больше одного, найти второе из них.
	 */
	String perem;
	String[] letters = new String[3]; // задание размера массива
	int checkValue;
	int minimumValue;
	int maximumValue;
	int saveAmount;
	int saveAmountLetter;
	
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
		
		int checkValueMax = letters[0].length(); // сохранение стартового значения
		int checkValueMin= letters[0].length(); // сохранение стартового значения
		
		// поиск наибольшего
		for(int i = 0; i < letters.length; i++) {
			checkValue = letters[i].length();
			
			if(checkValue > checkValueMax) {//поиск наибольшего, получение его индекса
				maximumValue = i;
				checkValueMax = checkValue;
			}
			
			if(checkValue < checkValueMin) { //поиск наименьшего, получение его индекса
				minimumValue = i;
				checkValueMin = checkValue;
			}
		}
	
		
		System.out.println("Letter Max: " + letters[maximumValue] + "; amount symbols: " + checkValueMax );
		System.out.println("Letter Min: " + letters[minimumValue] + "; amount symbols: " + checkValueMin );
		return letters;
	}

	public String[] searchMaxAverage() {
		//Ввести n строк с консоли. Вывести на консоль те строки, длина которых больше средней, а также длину.
		//подсчет общих символов
		int count = 0;
		int saveIndex = 0;
		int numeric = 0;
		for(int i = 0; i <letters.length; i++) {
			saveAmount += letters[i].length();//сохранение общего количества символов
			saveAmountLetter = letters.length;//сохранение количества строк
		}
		int perem = saveAmount / saveAmountLetter; // подсчет среднего количества элементов на слово
		System.out.println(perem);
		for(int i = 0; i < letters.length; i++) {
			if(letters[i].length() > perem) {
				count = letters[i].length(); // сохранение размера слова
				saveIndex = i; // сохранение индекса слова
				numeric++; // нумерация, для красоты в консоль.
				System.out.println(numeric + " Слово: " + letters[saveIndex] + " Длина: " + count);
			}
		}
		
		
		return letters;
	}
	
	public String[] searchMinAverage() {
		//Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше средней, а также длину
		//подсчет общих символов
		int count = 0;
		int saveIndex = 0;
		int numeric = 0;
		
		for(int i = 0; i <letters.length; i++) {
			
			saveAmount += letters[i].length();//сохранение общего количества символов
			
			saveAmountLetter = letters.length;//сохранение количества строк
			
		}
		int perem = saveAmount / saveAmountLetter; // подсчет среднего количества элементов на слово
		System.out.println(perem);
		
		for(int i = 0; i < letters.length; i++) {
			
			if(letters[i].length() < perem) {
				
				count = letters[i].length(); // сохранение размера слова
				
				saveIndex = i; // сохранение индекса слова
				
				numeric++; // нумерация, для красоты в консоль.
				
				System.out.println(numeric + " Слово: " + letters[saveIndex] + " Длина: " + count);
			}
		}
		
		
		return letters;
	}

	public String[] searchNumbers() {
		//Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.
				for(int i = 0; i <letters.length; i++) {
					
					
					
				}
	
		return letters;
	}
}
