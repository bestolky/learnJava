package com.bscideas.lists;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Lists {
	
	/*
		!DONE! - Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
		!DONE! Ввести n строк с консоли. Вывести на консоль те строки, длина которых больше средней, а также длину.
		!DONE! Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше средней, а также длину.
		Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.
		!DONE! Ввести n слов с консоли. Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.
		!DONE! Ввести n слов с консоли. Найти слово, состоящее только из цифр. Если таких слов больше одного, найти второе из них.
	 */
	String perem;
	int checkValue;
	int minimumValue;
	int maximumValue;
	int saveAmount;
	int saveAmountLetter;
	private Scanner sc;
	
	public String[] inputLetters(int sizeArray) { 
		
		String[] letters = new String[sizeArray]; 
		
		sc = new Scanner(System.in);
		//генерация массива
		for(int i = 0; i < letters.length; i++) {
			
			System.out.println("Input " + (i + 1) + " Letter: ");
			letters[i] = sc.nextLine();
		}
		
		System.out.println(letters[letters.length - 1]);
		perem = Arrays.toString(letters);

		return letters;
		
	}

	public void searchShortAndMaxElement(String[] letters) {
		
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
				String template = String.format("%d Слово: %s Длина: %d ", numeric, letters[saveIndex], count);
				System.out.println(template);
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

	public void searchNumbers() {
		//Ввести n слов с консоли. Найти слово, состоящее только из цифр. Если таких слов больше одного, найти второе из них.
		
		String regex = "\\d+";
		int count = 0;
		String saveWord = null;
		String secondWord = null;
		
		for(String word : letters) {
			
			if(word.matches(regex)) {
		        count++;
		        
		        saveWord = word;
		        
		        if(count == 2) {
		        	
		        	secondWord = word;
		        	
		        }
		      }
			}
		
		if(saveWord == null && secondWord == null) {
			
			System.out.println("Слов состоящих из цифр не введено!");
			
		}else if(secondWord != null) {
			
			System.out.println(secondWord);
			
		}else if(saveWord != null){
			
			System.out.println(saveWord);
		}
	}
	
	public void anotherSymbols(String[] letters){
		//Ввести n слов с консоли. Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.
		
		for(String word : letters) {
			
			char[] array = word.trim().toCharArray();
			boolean flag = true;
			
			for(int i = 0; i < array.length-1; i++) {
				
				for(int j = i+1; j < array.length; j++) {
					
					if(array[i] == array[j]) {
						flag = false;
						break;
					}
				}
			}
			if(flag) {
				System.out.println(word);
				break;
			}else {
				System.out.println("Не найдено!");
				break;
			}
		}
	}
}
