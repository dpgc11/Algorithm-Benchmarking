import java.util.Scanner;
import com.felight.utils.*;
import com.felight.algos.SortingAlgos;

public class UserInterface {
	private Scanner reader;
	private int[] array;
	private int[] dupArray;
	private int answerSizeOfArray;
	int answerComplexity;
	int answerSortingAlgorithm;
	
	public UserInterface(Scanner reader) {
		this.reader = reader;
	}
	
	public void start() {
		askForArraySize();
		askForComplexity();
		fillArray();
		askForSortingAlgo();
		
	}
	
	public void askForArraySize() {
		while(true) {
			try {
				System.out.println();
				System.out.println("Enter the size of the array: ");
				answerSizeOfArray = Integer.parseInt(reader.nextLine());
				if (answerSizeOfArray > Integer.MAX_VALUE || answerSizeOfArray == 0 || answerSizeOfArray < 0) {
					throw new NumberFormatException();
				}
				break;
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("Provide a smaller non-zero(or a valid) integer value please :)");
			}
		}
		
	}
	
	public void askForComplexity() {
		while(true) {
			try {
				System.out.println();
				System.out.println("Choose complexity: ");
				System.out.println("\t1. Best Case");
				System.out.println("\t2. Average Case");
				System.out.println("\t3. Worst Case");
				answerComplexity = Integer.parseInt(reader.nextLine());
				if (answerComplexity > 3 || answerComplexity == 0 || answerComplexity < 0) {
					throw new NumberFormatException();
				}
				break;
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("Please pick a number from 1, 2 and 3 as shown on the menu!");
			}
		}
		
	}
	
	public void fillArray() {
		while(true) {
			try {
				if (answerComplexity == 1) {
					array = Calculator.getNaturalNumbersArray(answerSizeOfArray);
					System.out.println("Natural array of size " + answerSizeOfArray + " is generated.");
					System.out.println();
					break;
				} else if (answerComplexity == 2) {
					array = Calculator.getRandomArray(answerSizeOfArray);
					System.out.println("Random array of size " + answerSizeOfArray + " is generated.");
					System.out.println();
					break;
				} else if (answerComplexity == 3) {
					array = Calculator.getReverseArray(answerSizeOfArray);
					System.out.println("Reversed array of size " + answerSizeOfArray + " is generated.");
					System.out.println();
					break;
				} 
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Sorry an array for the given size cannot be created. Please start over and select a smaller size!");
			}
		}
		
	}
	
	public void askForSortingAlgo() {
		while(true) {
			try {
				System.out.println("Choose sorting algorithm: ");
				System.out.println("\t1. Bubble Sort");
				System.out.println("\t2. Quick Sort");
				System.out.println("\t3. Insertion Sort");
				System.out.println("\t4. Selection Sort");
				System.out.println("\t5. Merge Sort");
				System.out.println("\t6. Benchmark All");
				System.out.println("\t7. Start Over");
				System.out.println("\t8. Exit");
				answerSortingAlgorithm = Integer.parseInt(reader.nextLine());
				
				if(answerSortingAlgorithm == 1) {
					Calculator.initDupArray(array, dupArray);
					SortingAlgos.bubbleSort(array);
					System.out.println();
				} else if (answerSortingAlgorithm == 2) {
					Calculator.initDupArray(array, dupArray);
					SortingAlgos.quickSortHelper(array);
					System.out.println();
				} else if (answerSortingAlgorithm == 3) {
					Calculator.initDupArray(array, dupArray);
					SortingAlgos.insertionSort(array);
					System.out.println();
				} else if (answerSortingAlgorithm == 4) {
					Calculator.initDupArray(array, dupArray);
					SortingAlgos.selectionSort(array);
					System.out.println();
				} else if (answerSortingAlgorithm == 5) {
					Calculator.initDupArray(array, dupArray);
					SortingAlgos.mergeSortHelper(array);
					System.out.println();
				} else if (answerSortingAlgorithm == 6) {
					Calculator.initDupArray(array, dupArray);
					SortingAlgos.bubbleSort(array);
					Calculator.initDupArray(array, dupArray);
					SortingAlgos.quickSortHelper(array);
					Calculator.initDupArray(array, dupArray);
					SortingAlgos.insertionSort(array);
					Calculator.initDupArray(array, dupArray);
					SortingAlgos.selectionSort(array);
					Calculator.initDupArray(array, dupArray);
					SortingAlgos.mergeSortHelper(array);
					System.out.println();
				} else if (answerSortingAlgorithm == 7) {
					restart();
				} else if (answerSortingAlgorithm == 8) {
					System.out.println("Thank You for using me, GoodBye!");
					System.exit(0);
				} else {
					System.out.println("Provide a proper number from the menu!");
					System.out.println();
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("Please pick a number from 1 and 8 as displayed on the menu!");
			}
		}
		
	}
	
	public void initArray() {
		for (int i = 0; i < array.length - 1 ; i++) {
			array[i] = 0;
		}
	}
	
	public void restart() {
		answerSizeOfArray = 0;
		answerComplexity = 0;
		answerSortingAlgorithm = 0;
		start();
	}

}
