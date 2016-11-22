package com.felight.utils;

public class Calculator {

	public static int[] getNaturalNumbersArray(int size) {
		int[] numbers = new int[size];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		return numbers;
	}

	public static int[] getRandomArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = ((int) ((Math.random()) * 1000));
		}

		return array;
	}

	public static int[] getReverseArray(int size) {
		int index = 0;
		int[] temp = new int[size];
		System.out.println(temp.length);
		for (int i = temp.length; i > 0; i--) {
			temp[index++] = i;
		}
		return temp;
	}
	
	public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


//	public static int[] doBubbleSort(int numbers[]) {
//		int temp;
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 1; j < (numbers.length - i); j++) {
//				if (numbers[j - 1] > numbers[j]) {
//					temp = numbers[j - 1];
//					numbers[j - 1] = numbers[j];
//					numbers[j] = temp;
//				}
//			}
//		}
//		return numbers;
//	}
//
//	public static int[] doSelectionSort(int[] arr) {
//		for (int i = 0; i < arr.length - 1; i++) {
//			int min = i;
//			for (int k = i + 1; k < arr.length; k++) {
//				if (arr[k] < arr[min]) {
//					min = k;
//				}
//			}
//			if (i != min) {
//				int temp = arr[i];
//				arr[i] = arr[min];
//				arr[min] = temp;
//			}
//		}
//		return arr;
//	}
//
//	public static int[] doInsertionSort(int[] input) {
//		int temp;
//		for (int i = 1; i < input.length; i++) {
//			for (int j = i; j > 0; j--) {
//				if (input[j] < input[j - 1]) {
//					temp = input[j];
//					input[j] = input[j - 1];
//					input[j - 1] = temp;
//				}
//			}
//		}
//		return input;
//	}
}