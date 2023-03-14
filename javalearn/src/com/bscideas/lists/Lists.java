package com.bscideas.lists;

import java.util.Arrays;
import java.util.Scanner;

public class Lists {
	
	String[] letters = new String[3];

	public String[] inputLetters() { 
		
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		//генерация массива
		for(i = 0; i < letters.length; i++) {
			System.out.println("Input " + (i + 1) + " Letter: ");
			letters[i] = sc.nextLine();
		}
		
		System.out.println(Arrays.toString(letters));
		return letters;
		
	}


	public void searchShortAndMaxElement() {
		int count = 0;
		int countTemp = 0;
		char[] changeLetterToChar = letters.toString().toCharArray();
		System.out.println(Arrays.toString(changeLetterToChar));
		for(int i = 0; i < changeLetterToChar.length; i++) {
			
		}
		/*for(int i = 0; i < letters.length; i++) {
			count++;
			System.out.println(count);
		}*/
	}

}
