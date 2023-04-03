package com.bscideas.arrays;

import java.util.Arrays;

public class WorkArray {
	
	/*
	1)В массиве целых чисел поменять местами максимальный отрицательный элемент и минимальный положительный. - DONE
	2)В массиве целых чисел определить сумму элементов, состоящих на чётных позициях. - DONE
	3)В массиве целых чисел заменить нулями отрицательные элементы. - DONE
	4)В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным. DONE
	5)В массиве целых чисел найти разницу между средним арифметическим и значение минимального элемента. - DONE
	6)В массиве целых чисел вывести все элементы, которые встречаются больше одного раза и индексы которых нечётные. DONE
	7)В массиве целых чисел заменить все нечётные числа на 0. - DONE
	 */

 	public int[] generateArray(int sizeArray) {
 		
 		int[] array = new int[sizeArray];
 		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = (int) Math.round((Math.random() * 20) - 10);

		}
		System.out.println(Arrays.toString(array));
		
		return array;
	}
		
	public int[] searchElements(int[] array) {
		//6)В массиве целых чисел вывести все элементы, которые встречаются больше одного раза и индексы которых нечётные.
		
		Arrays.sort(array);
			
		for(int i = 0; i < array.length; i++) {
			
			for(int j = i+1; j < array.length; j++) {
				
				if(array[i] == array[j] && array[i]%2 != 0) {
			          
			         String template = String.format("Число: %d", array[i]);
			          
			         System.out.println(template);
				}
			}
		}
		
		return array;
	}
	
	public int[] multiplicateThree(int[] array) {
		
		//4)В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным.
		
		for(int i = 0; i < array.length-1; i++) {
			
			if(array[i] > 0 && array[i+1] < 0) {
				
				array[i] = array[i] * 3;
			
			}
		}
		
		System.out.println("Утроенный положительный элемент перед отрицательным: " + Arrays.toString(array));
		
		return array;
	}
	
	public int differentMidAdnMinElement(int[] array) {
		
		//5)В массиве целых чисел найти разницу между средним арифметическим и значение минимального элемента.
		
		int minimumValueForDifferent = array[0];
		
		int sumDifferentValues = 0;
		
		int sumDifferent = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			sumDifferentValues += array[i];
			
			if(array[i] < minimumValueForDifferent) {
				
				minimumValueForDifferent = array[i];
			}
		}
		
		sumDifferent = sumDifferentValues - minimumValueForDifferent;
		
		System.out.println(sumDifferent);
		
		return sumDifferent;
	}
	
	public int[] searchSum(int[] array) {
		
		//2)В массиве целых чисел определить сумму элементов, состоящих на чётных позициях.
		
		int tempSum = 0;
		
		for (int i = 1; i < array.length; i++) {
			
			if(i%2 == 0) {
				
				tempSum += array[i];
			}
		}
		
		System.out.println("Сумма элементов на четных позициях: " + tempSum);
		
		return array;
	}
	
	public int[] changeMinusValue(int[] array) {
		
		//3)В массиве целых чисел заменить нулями отрицательные элементы. 
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] < 0) {
				
				array[i] = 0;
			}
		}
		
		System.out.println("Отрицательные числа на нули: " + Arrays.toString(array));
		
		return array;
	}
	
	public int[] changeIntValue(int[] array) {
		
		//7)В массиве целых чисел заменить все нечётные числа на 0.
		
		for (int i = 0; i < array.length; i++) {
			
			if(i%2 != 0) {
				
				array[i] = 0;
			}
		}
		
		System.out.println("Все нечётные на 0: " + Arrays.toString(array));
		
		return array;
	}

	public int[] changePlace(int[] array) {
		
		//Задание 1, замена местами максимального отрицательного и минимального положительного 
		
		int tempMinimumPlusValue = array[0];
		
		int minimumMinusValue = array[0];
		
		int indexMinValue = 0;
		
		int indexPlusValue = 0;

		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] > tempMinimumPlusValue) { //поиск наибольшего
				
				tempMinimumPlusValue = array[i];
				
			}
			
			if(array[i] < minimumMinusValue) { //поиск наименьшего
				
				indexMinValue = i;
				
				minimumMinusValue = array[i];
				
			}
		}
		
		//поиск наименьшего положительного
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] < tempMinimumPlusValue && array[i]> 0) {
				
				indexPlusValue = i;
				
				tempMinimumPlusValue = array[i];
				
			}
		}
		int temp = array[indexPlusValue];
		
		array[indexPlusValue] = array[indexMinValue];
		
		array[indexMinValue] = temp; 
		
		System.out.println("замена местами максимального отрицательного и минимального положительного: " + Arrays.toString(array));
		
		return array;
	}

}
