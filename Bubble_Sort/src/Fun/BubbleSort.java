package Fun;

import java.util.Random;

public class BubbleSort {
	
	public static int[] bubbleSort(int[] array) {
		int valueHolder;
		
		boolean sorted = true;
		
		for(int i = 0; i < array.length-1; i++) {
			for(int j = 0; j < array.length-1-i; j++) {
				if(array[j+1] < array[j]) {
					sorted = false;
					valueHolder = array[j];
					array[j] = array[j+1];
					array[j+1] = valueHolder;
				}
			}
		}
		if(sorted = false) {
			return bubbleSort(array);
		}else {
			return array;
		}
			
	}

	public static void main(String[] args) {
		Random rand = new Random();
		
		int array[] = new int[5];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
		}
		
		bubbleSort(array);
		
		for(int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
		

	}

}
