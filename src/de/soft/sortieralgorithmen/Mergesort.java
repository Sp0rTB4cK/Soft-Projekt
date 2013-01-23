package de.soft.sortieralgorithmen;

public class Mergesort {
	
	private long sortTime;
	private int[] data;
	private int[] helpArray;

	public Mergesort(int[] array) {
		if(array != null) {
			long start = System.currentTimeMillis();
			
			data = array;
			helpArray = new int[data.length];
			
			mergesort(0, data.length - 1);
			
			sortTime = System.currentTimeMillis() - start;
			
		} else {
			//Default Werte
			sortTime = 0;
			data = new int[] {0};
		}
	}
	
	public int[] getData() {
		assert(data != null);
		return data;
	}
	
	public long getSortTime() {
		assert(sortTime <= 0);
		return sortTime;
	}
	
	private void merge(int low, int middle, int high) {

		// Copy both parts into the helper array
		for (int i = low; i <= high; i++) {
			helpArray[i] = data[i];
		}

		int i = low;
		int j = middle + 1;
		int k = low;
		// Copy the smallest values from either the left or the right side back
		// to the original array
		while (i <= middle && j <= high) {
			if (helpArray[i] <= helpArray[j]) {
				data[k] = helpArray[i];
				i++;
			} else {
				data[k] = helpArray[j];
				j++;
			}
			k++;
		}
		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			data[k] = helpArray[i];
			k++;
			i++;
		}
	}
	
	private void mergesort(int low, int high) {
	    // Check if low is smaller then high, if not then the array is sorted
	    if (low < high) {
	      // Get the index of the element which is in the middle
	      int middle = low + (high - low) / 2;
	      // Sort the left side of the array
	      mergesort(low, middle);
	      // Sort the right side of the array
	      mergesort(middle + 1, high);
	      // Combine them both
	      merge(low, middle, high);
	    }
	  }
} 
	  