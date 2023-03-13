package com.bscideas.arrays;

import java.util.Arrays;

public class WorkArray {
	
	/*
	1)В массиве целых чисел поменять местами максимальный отрицательный элемент и минимальный положительный. - DONE
	2)В массиве целых чисел определить сумму элементов, состоящих на чётных позициях. - DONE
	3)В массиве целых чисел заменить нулями отрицательные элементы. - DONE
	4)В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным. In Progress
	5)В массиве целых чисел найти разницу между средним арифметическим и значение минимального элемента. - DONE
	6)В массиве целых чисел вывести все элементы, которые встречаются больше одного раза и индексы которых нечётные. In Progress
	7)В массиве целых чисел заменить все нечётные числа на 0. - DONE
	 */

	int tempSum = 0;
	int minimumValueForDifferent;
	int tempMinimumPlusValue;
	int minumumPlusvalue;
	int minimumMinusValue;
	int indexMinValue;
	int indexPlusValue;
	int sumDifferentValues;
	int sumDifferent;
	int multiplicateThreeValue;
	int multiplicateThreeValueSum;
	
	int[] array = new int[20];
	
	public int[] generateArray() {
		// Генерация массива от -10 до +10
		for (int i = 0; i < array.length; i++) {
			
			array[i] = (int) Math.round((Math.random() * 20) - 10);
			//array[i] = (int) Math.round((Math.random() * 20));
		}
		return array;
	}
	
	public int[] multiplicateThree() {
		//4)В массиве целых чисел утроить каждый положительный элемент, который стоит перед отрицательным.
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] > 0 && array[i+1] < 0) {
				System.out.println(array[i]);
			}
			
		}
		
		return array;
	}
	
	public int searchDublicate() {
		//В массиве целых чисел вывести все элементы, которые встречаются больше одного раза и индексы которых нечётные.
		for(int i = 0; i < array.length; i++) {
			
		}
		
		return 1;
	}
	
	public int differentMidAdnMinElement() {
		minimumValueForDifferent = array[0];
		//5)В массиве целых чисел найти разницу между средним арифметическим и значение минимального элемента.
		for (int i = 0; i < array.length; i++) {
			
			sumDifferentValues += array[i];
			
			if(array[i] < minimumValueForDifferent) {
				minimumValueForDifferent = array[i];
			}
		}
		
		return sumDifferent = sumDifferentValues - minimumValueForDifferent;
	}
	
	public int[] searchSum() {
		//2)В массиве целых чисел определить сумму элементов, состоящих на чётных позициях.
		for (int i = 1; i < array.length; i++) {
			if(i%2 == 0) {
				tempSum += array[i];
			}
		    
		}
		return array;
	}
	
	public int[] changeMinusValue() {
		//3)В массиве целых чисел заменить нулями отрицательные элементы. 
		for (int i = 0; i < array.length; i++) {
			if(array[i] < 0) {
				array[i] = 0;
			}
		}
		return array;
	}
	
	public int[] changeIntValue() {
		//7)В массиве целых чисел заменить все нечётные числа на 0.
		for (int i = 0; i < array.length; i++) {
			if(i%2 != 0) {
				array[i] = 0;
			}
		}
		return array;
	}

	
	public int[] changePlace() {
		//Задание 1, замена местами максимального отрицательного и минимального положительного 
		//(будет ли считаться 0 положительным?) 
		tempMinimumPlusValue = array[0];
		minimumMinusValue = array[0];
		
		//поиск наибольшего
		for(int i = 0; i < array.length; i++) {
			if(array[i] > tempMinimumPlusValue) {
				
				tempMinimumPlusValue = array[i];
				
			}
		}
		
		//поиск максимального отрицательного
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] < minimumMinusValue) {
				
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
		return array;
	}

	@Override
	public String toString() {
		return "WorkArray [generateArray()=" + Arrays.toString(array) + "]";
	}
	
}