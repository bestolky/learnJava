package com.bscideas.lists;

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

	private Scanner sc;
	
	public String[] inputLetters(int sizeArray) { 
		
		String[] letters = new String[sizeArray]; 
		
		sc = new Scanner(System.in);
		//генерация массива
		
		for(int i = 0; i < letters.length; i++) {
			
			System.out.println("Input " + (i + 1) + " Letter: ");
			
			letters[i] = sc.nextLine();
		}

		return letters;
		
	}

	public void searchShortAndMaxElement(String[] letters) {
		
		int checkValueMax = letters[0].length(); // сохранение стартового значения
		
		int checkValueMin = letters[0].length(); // сохранение стартового значения
		
		int checkValue;
		
		int maximumValue = 0;
		
		int minimumValue = 0;
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
		String templateMax = String.format("Letter Max: %s Длина: %d ", letters[maximumValue], checkValueMax);
		
		String templateMin = String.format("Letter Min: %s Длина: %d ", letters[minimumValue], checkValueMin);
		
		System.out.println(templateMax);
		
		System.out.println(templateMin);
		
	}

	public void searchMaxAverage(String[] letters) {
		
		//Ввести n строк с консоли. Вывести на консоль те строки, длина которых больше средней, а также длину.
		//подсчет общих символов
		int count = 0;
		
		int saveIndex = 0;
		
		int numeric = 0;
		
		int saveAmount = 0;
		
		int saveAmountLetter = 0;
		
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
	}
	
	public void searchMinAverage(String[] letters) {
		//Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше средней, а также длину
		//подсчет общих символов
		
		int count = 0;
		
		int saveIndex = 0;
		
		int numeric = 0;
		
		int saveAmount = 0;
		
		int saveAmountLetter = 0;
		
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
				
				String template = String.format("%d Слово: %s Длина: %d ", numeric, letters[saveIndex], count);
				System.out.println(template);
			}
		}
	}

	public void searchNumbers(String[] letters) {
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
		boolean flag = true;
		
		for(String word : letters) {
			
			char[] array = word.trim().toCharArray();
		
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
	
	public void minimumDifferent(String[] letters) {
	//Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.
		
			int count = 0;
			
			int tempCount = 0;
			
			String saveWord = "";
			
			for(String word : letters) {
			
			char[] array = word.trim().toCharArray();
			
			for(int i = 0; i < array.length-1; i++) {

				for(int j = i+1; j < array.length; j++) {
					
					if(array[i] == array[j]) {
						
						count++;

					}
				}
			}
			
			if(count > tempCount) {
				
				tempCount = count;
				
				saveWord = word;
				
			}
			
			count = 0;
		}
			if(saveWord == "") {
				System.out.println("Слов с одинаковыми символами не найдено");
			}else {
			String template = String.format("Слово с наименьшим количеством различных символов: %s",  saveWord);
			System.out.println(template);
			
			}
	}
}
